SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "MIT"

PV = "0.9.1~0"

RPM_NAME = "bottom-0.9.1~0-1.1.aarch64.rpm"
RPM_HASH = "cb70e689f41d339cb244c0a47973c751b30c7d351a22fe395006b77ec2e67ebb403f5089c37ae2f26322bbfcc4c96d31cc2a4116625b808c98c9fec7ffe59921"

RPROVIDES:${PN} += "bottom"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
