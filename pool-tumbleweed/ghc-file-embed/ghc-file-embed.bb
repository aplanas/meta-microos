SUMMARY = "Use Template Haskell to embed file contents directly"
DESCRIPTION = "Use Template Haskell to read a file or all the files in a directory, and turn \
them into (path, bytestring) pairs embedded in your Haskell code."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-0.0.15.0-2.2.aarch64.rpm"
RPM_HASH = "3e07e750ae8d48f9c9a02a2bf22d842e0c65d6b36ef49b7389dffa78cc376adfd4a7c8bbf342d2c54fc83629a06f371e9c6fcd3f1e67295624ad27d71c382c8a"

RPROVIDES:${PN} += "ghc-file-embed \
ghc-file-embed(aarch-64) \
libHSfile-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
