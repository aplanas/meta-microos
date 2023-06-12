SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_3-1-1.0.93-10.2.aarch64.rpm"
RPM_HASH = "db2d3dc518c4fbe0a2ac9d9046e6f42e452747c866a0948eb1e5d3d51706705d9e27868404d89d2d424a98238a298c2855b854a4d4637e9adebe5cae6f53dfd0"

RPROVIDES:${PN} += "libtolua++-5.3.so.1()(64bit) \
libtolua++-5_3-1 \
libtolua++-5_3-1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.3.so.5()(64bit) \
libm.so.6()(64bit)"

inherit rpm
