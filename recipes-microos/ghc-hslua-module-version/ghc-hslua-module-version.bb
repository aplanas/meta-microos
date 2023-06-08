SUMMARY = "Lua module to work with version specifiers"
DESCRIPTION = "Wrapper for the Data.Version.Version Haskell type."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "d8e7a58e09afc7dcd957b0ac51a6d96ff3642937cc7c724679b3cff412a5f912de5c468f5875d88d99fb3e9f7a663909794722a3235045b49d2ca1b945c954a9"

RPROVIDES:${PN} += "ghc-hslua-module-version ghc-hslua-module-version(aarch-64) libHShslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit) libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so()(64bit) libHShslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl-ghc9.4.5.so()(64bit) libHShslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4-ghc9.4.5.so()(64bit) libHShslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj-ghc9.4.5.so()(64bit) libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
