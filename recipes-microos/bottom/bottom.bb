SUMMARY = "Yet another graphical process/system monitor"
DESCRIPTION = "A cross-platform graphical process/system monitor with a \
customizable interface and a multitude of features."
LICENSE = "MIT"

PV = "0.8.0~0"

RPM_NAME = "bottom-0.8.0~0-1.3.aarch64.rpm"
RPM_HASH = "65aea60ee63a1b35bc5d7a6861705c1b0bcbbf2ea26cba1e42f8fa771bac3148059d2b8355c727989d75fa5e4e14ef0dfd3bba3b78036118da990cdc689ac01b"

RPROVIDES:${PN} += "bottom bottom(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
