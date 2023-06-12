SUMMARY = "Nicer interface for reified information about data types"
DESCRIPTION = "This package normalizes variations in the interface for inspecting datatype \
information via Template Haskell so that packages and support a single, easier \
to use informational datatype while supporting many versions of Template \
Haskell."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-0.4.5.0-2.3.aarch64.rpm"
RPM_HASH = "b979f2270d1b57828359818df171a74332902aada2ab2b9d01b121512b911b6c28f1eead4060a220a7040b73e660a4fd699fe510dfa947d8481d51f27bd84060"

RPROVIDES:${PN} += "ghc-th-abstraction \
ghc-th-abstraction(aarch-64) \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
