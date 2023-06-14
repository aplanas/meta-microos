SUMMARY = "Lua module to work with file paths"
DESCRIPTION = "Lua module to work with file paths in a platform independent way."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "be745c212bcf9bb2e47d048960c38dcf7ad26e18131f36df309d4cc41d10f1184792fb31941c9f8cb3368c9d992a14d8584a9d23abf2208bbbd5ada19fe66f4c"

RPROVIDES:${PN} += "ghc-hslua-module-path \
libHShslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so \
libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so \
libHShslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl-ghc9.4.5.so \
libHShslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4-ghc9.4.5.so \
libHShslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj-ghc9.4.5.so \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
