SUMMARY = "Retrieve information about disk space usage"
DESCRIPTION = "A cross-platform library for retrieving information about disk space usage."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-0.1.0.1-5.2.aarch64.rpm"
RPM_HASH = "c3cabd40065561878c4f2997500110e84f6b1746ee96ed49e11db1332773424cb2f48d24f55aae3a92d00a4eaede1b15f39b04302e7f1b9893588ab70763b88c"

RPROVIDES:${PN} += "ghc-disk-free-space \
ghc-disk-free-space(aarch-64) \
libHSdisk-free-space-0.1.0.1-CGtWAgWYeLt876pNI1pHoX-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
