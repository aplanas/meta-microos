SUMMARY = "The command-line interface for Cabal and Hackage"
DESCRIPTION = "The solver component used in cabal-install command-line program."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-cabal-install-solver-3.8.1.0-1.3.aarch64.rpm"
RPM_HASH = "c40c46ac4530b269f9a80c1d93429bcf99c54651e243511d2421156b4ada55ae3adaa79c7ccacb0a919fd50d51cce52eb2d5ac9496c654374c9e70bc0fb7aa7f"

RPROVIDES:${PN} += "ghc-cabal-install-solver ghc-cabal-install-solver(aarch-64) libHScabal-install-solver-3.8.1.0-IpM66GQ0mvV3BDvTXL2kvp-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSCabal-3.8.1.0-ghc9.4.5.so()(64bit) libHSCabal-syntax-3.8.1.0-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSedit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so()(64bit) libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
