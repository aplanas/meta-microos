SUMMARY = "Use Template Haskell to embed file contents directly"
DESCRIPTION = "Use Template Haskell to read a file or all the files in a directory, and turn \
them into (path, bytestring) pairs embedded in your Haskell code."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-0.0.15.0-2.3.aarch64.rpm"
RPM_HASH = "37170bad490907dc8f6a9d056e72690bc120ae3d0dba69bb309e9bc0b81714c545b878518c256b7c31d0ecb6150a1d1f309581335882d0007f151512d3c268f7"

RPROVIDES:${PN} += "ghc-file-embed \
libHSfile-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv-ghc9.4.6.so"

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
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
