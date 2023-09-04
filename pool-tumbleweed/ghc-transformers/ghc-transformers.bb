SUMMARY = "Haskell transformers library"
DESCRIPTION = "This package provides the Haskell transformers library."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-0.5.6.2-1.1.aarch64.rpm"
RPM_HASH = "9443bee4ae70dea2daa914aed181c7de64ba0a051c5a3809dac96d667b4b2531dc4888bf1310f9d0e9ceb5989bfdc5ddd6c560d507550d20cb077d1e2dc641c7"

RPROVIDES:${PN} += "ghc-transformers \
libHStransformers-0.5.6.2-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
