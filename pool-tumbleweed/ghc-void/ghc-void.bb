SUMMARY = "A Haskell 98 logically uninhabited data type"
DESCRIPTION = "A Haskell 98 logically uninhabited data type, used to indicate that a given \
term should not exist."
LICENSE = "BSD-3-Clause"

PV = "0.7.3"

RPM_NAME = "ghc-void-0.7.3-6.3.aarch64.rpm"
RPM_HASH = "cbd0cd8141fa1211530a8501544d9266dbb00ff51d89afb44ed4fe3bcd691449e664cf1aadb63013445035877d342adb68a3faec91536a83ba5a43900b93fed4"

RPROVIDES:${PN} += "ghc-void \
libHSvoid-0.7.3-GhXmDKlBHl0LbXoxVMxAU0-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
