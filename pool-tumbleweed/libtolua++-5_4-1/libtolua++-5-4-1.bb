SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-1-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "1948e68febed75b95a9422912d2aa6e1a0353adb3a6ab2fbd5cc04607772ca22ca4ad51eadf0a61c1234017c9dc0de2ce47cf79d83ed77aaba1517ced28aab9b"

RPROVIDES:${PN} += "libtolua++-5.4.so.1()(64bit) \
libtolua++-5_4-1 \
libtolua++-5_4-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit)"

inherit rpm
