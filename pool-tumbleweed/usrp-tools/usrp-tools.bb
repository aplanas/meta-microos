SUMMARY = "Tools for the URSP1 SDR"
DESCRIPTION = "Tools for the URSP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "usrp-tools-3.4.7-1.5.aarch64.rpm"
RPM_HASH = "d37415bb9a0e1a1dedff022c423920c77d1ea134f0f4c2d4b7906e1c73927882a6946b2ecb438ea5d95530b78ab4f2d21ed2d73ccfa7d5cdc817e0d4427e52b5"

RPROVIDES:${PN} += "usrp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusrp.so.1"

inherit rpm
