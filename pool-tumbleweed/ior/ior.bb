SUMMARY = "Parallel filesystem I/O benchmark"
DESCRIPTION = "Parallel filesystem I/O benchmark"
LICENSE = "GPL-2.0-only"

PV = "3.3.0"

RPM_NAME = "ior-3.3.0-2.9.aarch64.rpm"
RPM_HASH = "2f60698ef521945116b1c3190012f96e9d51c7df36ae5d17a26e6bce0f417e637b65f67f4a9740133ef28c5e9247881914e4eee1bce92ecf4895ffb5a7d4ad5f"

RPROVIDES:${PN} += "ior \
ior(aarch-64) \
mdtest"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpi.so.20()(64bit) \
librados.so.2()(64bit) \
openmpi2"

inherit rpm
