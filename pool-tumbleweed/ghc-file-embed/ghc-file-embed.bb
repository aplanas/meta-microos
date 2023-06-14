SUMMARY = "Use Template Haskell to embed file contents directly"
DESCRIPTION = "Use Template Haskell to read a file or all the files in a directory, and turn \
them into (path, bytestring) pairs embedded in your Haskell code."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-0.0.15.0-2.2.aarch64.rpm"
RPM_HASH = "3e07e750ae8d48f9c9a02a2bf22d842e0c65d6b36ef49b7389dffa78cc376adfd4a7c8bbf342d2c54fc83629a06f371e9c6fcd3f1e67295624ad27d71c382c8a"

RPROVIDES:${PN} += "ghc-file-embed \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
