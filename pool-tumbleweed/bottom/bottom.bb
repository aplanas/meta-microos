SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "MIT"

PV = "0.9.1~0"

RPM_NAME = "bottom-0.9.1~0-1.1.aarch64.rpm"
RPM_HASH = "cb70e689f41d339cb244c0a47973c751b30c7d351a22fe395006b77ec2e67ebb403f5089c37ae2f26322bbfcc4c96d31cc2a4116625b808c98c9fec7ffe59921"

RPROVIDES:${PN} += "bottom \
bottom(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
