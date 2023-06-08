SUMMARY = "Prevent or capture writing to stdout and other handles"
DESCRIPTION = "Prevent or capture writing to stdout, stderr, and other handles."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-1.2.5.3-2.2.aarch64.rpm"
RPM_HASH = "0d7fef27f9db444674800b37bb5c7209e72c75a07f447070d8a24a393d3ff508e27a5a5b9f73241b943f5813507f4c366b6c75744d5339859db6b47ba335dd2b"

RPROVIDES:${PN} += "ghc-silently ghc-silently(aarch-64) libHSsilently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
