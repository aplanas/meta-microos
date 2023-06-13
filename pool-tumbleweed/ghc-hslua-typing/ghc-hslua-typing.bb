SUMMARY = "Type specifiers for Lua"
DESCRIPTION = "Structure to hold detailed type information. The primary use-case at this time \
are auto-generated docs."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-0.1.0-1.2.aarch64.rpm"
RPM_HASH = "67f24abb2ac62befa7b964b10a7b859cc5a345f98bca44e9a0a190dba38e56faeda0dcddee51373a047d63a841a520cdef5e2959d776b2900b79eb1a413fefff"

RPROVIDES:${PN} += "ghc-hslua-typing \
ghc-hslua-typing(aarch-64) \
libHShslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC-ghc9.4.5.so()(64bit) \
libHShslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq-ghc9.4.5.so()(64bit) \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
