SUMMARY = "A binary serialization library"
DESCRIPTION = "A binary serialization library, similar to binary, that introduces an isolate \
primitive for parser isolation, and labeled blocks for better error messages."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-0.5.8.3-2.3.aarch64.rpm"
RPM_HASH = "d35b58d7eda2d4f7f67310b3561727b20d204c213e2d7fe68b9164506813e9257f9f192e741946c8e7d985e1e01fbabe08f65ad98dcc7abc62113e4f373702a7"

RPROVIDES:${PN} += "ghc-cereal \
ghc-cereal(aarch-64) \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
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
