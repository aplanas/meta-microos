SUMMARY = "Tools for the URSP1 SDR"
DESCRIPTION = "Tools for the URSP1 SDR."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.7"

RPM_NAME = "usrp-tools-3.4.7-1.4.aarch64.rpm"
RPM_HASH = "b0fd3043dab9551bb02f3261361da3471d84b89e09e96f687d73f3fc24fea0b2f0b5c75d50bca7df3197bb18af0a0a9e8e6a24fe779e4166a1f18c5f68cc9e60"

RPROVIDES:${PN} += "usrp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusrp.so.1"

inherit rpm
