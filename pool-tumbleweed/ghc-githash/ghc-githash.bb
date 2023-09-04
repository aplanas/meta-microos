SUMMARY = "Compile git revision info into Haskell projects"
DESCRIPTION = "Compile git revision info into Haskell projects."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-0.1.7.0-1.5.aarch64.rpm"
RPM_HASH = "13e1e25e409126266e1411bca2b04bc9e174e6e9735a521b1e3c2fae2d528f12258a78c2eac10e3c02e1727eaa2c3ec41bc5bb313a713ca36283df2f97c06ce7"

RPROVIDES:${PN} += "ghc-githash \
libHSgithash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSth-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
