SUMMARY = "Haskell exceptions library"
DESCRIPTION = "This package provides the Haskell exceptions library."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-0.10.5-1.1.aarch64.rpm"
RPM_HASH = "1433aec7c71e18543759420e9946ae7edd59e9305414976cc5dfdd9fe5fac2102ccfd97980b8f54e874ed74787f19fb16432c05b58dd8caa871002d6bb5f9e1f"

RPROVIDES:${PN} += "ghc-exceptions ghc-exceptions(aarch-64) libHSexceptions-0.10.5-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
