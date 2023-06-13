SUMMARY = "Read and write numerical arrays"
DESCRIPTION = "Library for compressed numerical arrays that support high \
throughput read and write random access."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "zfp-1.0.0-1.3.aarch64.rpm"
RPM_HASH = "dcd27f641fd39b8ba8359606a19c2b0c5ea0e706ccde93e9ed9270095005ca3bb68e69034c22c88269829b939436e62c511d39e62a85b984531adc98d0fc678d"

RPROVIDES:${PN} += "zfp \
zfp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libzfp.so.1()(64bit)"

inherit rpm
