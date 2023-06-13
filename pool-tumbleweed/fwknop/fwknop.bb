SUMMARY = "The fwknop Client"
DESCRIPTION = "fwknop stands for the 'FireWall KNock OPerator', and implements an authorization \
scheme called Single Packet Authorization (SPA)."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "fwknop-2.6.10-3.8.aarch64.rpm"
RPM_HASH = "2539c48cea52f073ce852a608c413d7372a180e81c7063f2eac2446c9d795e1421f6873efe2c57b95ccc1c66164114af013a59a1b7d0e2e1f819ddf80c12e3e9"

RPROVIDES:${PN} += "fwknop \
fwknop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfko.so.3()(64bit)"

inherit rpm
