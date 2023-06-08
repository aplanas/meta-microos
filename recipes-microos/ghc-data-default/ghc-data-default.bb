SUMMARY = "A class for types with a default value"
DESCRIPTION = "A class for types with a default value."
LICENSE = "BSD-3-Clause"

PV = "0.7.1.1"

RPM_NAME = "ghc-data-default-0.7.1.1-10.2.aarch64.rpm"
RPM_HASH = "c9103c5e1865ea976bce26c34672260e1f82d56aa50f8b6ca4f67422e948236c654124a67afaa15c5a0cb3c213b336d376947f043a43af82da3701467085168c"

RPROVIDES:${PN} += "ghc-data-default ghc-data-default(aarch-64) libHSdata-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so()(64bit) libHSdata-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz-ghc9.4.5.so()(64bit) libHSdata-default-instances-dlist-0.0.1-Bmo6e1Lr8bt987tygJ1EBf-ghc9.4.5.so()(64bit) libHSdata-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
