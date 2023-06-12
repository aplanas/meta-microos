SUMMARY = "Default instances for types in old-locale"
DESCRIPTION = "Default instances for types in old-locale."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "801c2ece0573bcdc3d5e78d41f931d084162262dc8196645ce4ce4d9bc99f6a83e5aa6ec15fdfcbf1bb680ed23e259b5eb11bcc534baa0a3c9071a626c2e0fcf"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale \
ghc-data-default-instances-old-locale(aarch-64) \
libHSdata-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm