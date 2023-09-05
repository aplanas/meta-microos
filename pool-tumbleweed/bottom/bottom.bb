SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "Apache-2.0 & MIT"

PV = "0.9.6~0"

RPM_NAME = "bottom-0.9.6~0-2.1.aarch64.rpm"
RPM_HASH = "f49200d7c37ffdac2c7df5ff47b96700b77656fdeb9c585504030fca31beab4ecfd5586fcb6ae57f162dbd2a87070d8d819c2bcca2710868a4a34d16cd9bb37a"

RPROVIDES:${PN} += "bottom"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
