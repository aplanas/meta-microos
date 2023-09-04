SUMMARY = "Compile git revision info into Haskell projects"
DESCRIPTION = "Some handy Template Haskell splices for including the current git hash and \
branch in the code of your project. Useful for including in panic messages, \
'--version' output, or diagnostic info for more informative bug reports."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-1.3.1-9.4.aarch64.rpm"
RPM_HASH = "772908d13ac4e92d80dfb87bcd93f2c7171fef6c34a4139b106fdbf6edcc4c44f45cfe60d913dd6454a4ba6ee982d1e896589e3d15be7c6bd14cda928605bd4f"

RPROVIDES:${PN} += "ghc-gitrev \
libHSgitrev-1.3.1-9Q0DldHbAfz2pygdzHH3jX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbase-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1-ghc9.4.6.so \
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
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
