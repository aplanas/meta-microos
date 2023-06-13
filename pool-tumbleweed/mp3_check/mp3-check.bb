SUMMARY = "MP3 Format Validator"
DESCRIPTION = "mp3_check helps identifying, in detail, MP3 files that do not \
correctly follow the MPEG-1 Layer 3 format. It looks for invalid \
frame headers, missing frames, etc., and generates statistics. This \
can especially be important when building a file archive of a certain \
quality."
LICENSE = "GPL-2.0-or-later"

PV = "1.98"

RPM_NAME = "mp3_check-1.98-3.11.aarch64.rpm"
RPM_HASH = "1de83347b95da1a3db43ed2fd0c3d0c3a7c7a67cf2c3197469cfefe361604735731c12125c23bb27ce67e9b2762bf90db94bd024c623b56e2d988e8bd3b7af93"

RPROVIDES:${PN} += "mp3_check \
mp3_check(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
