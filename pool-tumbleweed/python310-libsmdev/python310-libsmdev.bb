SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python310-libsmdev-20221028-2.8.aarch64.rpm"
RPM_HASH = "077beeb948acc973facd5786d3ebee08b76db52f559a44ce13617cff7dabfb63db35cddf3c991e16cfcb5296974d4fffbd14116e476f46566a414730c668ccaa"

RPROVIDES:${PN} += "python3-libsmdev \
python310-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
