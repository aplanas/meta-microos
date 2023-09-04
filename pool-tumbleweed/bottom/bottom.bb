SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "MIT"

PV = "0.9.6~0"

RPM_NAME = "bottom-0.9.6~0-1.1.aarch64.rpm"
RPM_HASH = "3d2154a0e23961be040e585b47818d797a1f63d70e19e268c22ed1857b532fc903202f33e848b458664721d6c2d498c0893e3f26ba9fccc243a9352f84575c84"

RPROVIDES:${PN} += "bottom"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
