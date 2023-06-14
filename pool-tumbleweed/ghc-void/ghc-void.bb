SUMMARY = "A Haskell 98 logically uninhabited data type"
DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to indicate that a given \
term should not exist."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-0.7.3-6.2.aarch64.rpm"
RPM_HASH = "b49082dacbdf6f226d85a72513edac99ae3675bd4e27ebc52b08046e6abdf57d2e668f68c85fc1b4ad8dd878d8c2c2c778fde2fd49226126668dad97b837b1bb"

RPROVIDES:${PN} += "ghc-void \
libHSvoid-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
