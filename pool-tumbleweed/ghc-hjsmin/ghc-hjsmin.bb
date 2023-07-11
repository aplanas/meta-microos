SUMMARY = "Haskell implementation of a javascript minifier"
DESCRIPTION = "Reduces size of javascript files by stripping out extraneous whitespace and \
other syntactic elements, without changing the semantics."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "cf05b8d06afe4a87f6f6a5db0b17e901cd885b8828bb1ccaf36cd5d0570b356a6fd57e61fb6a07942ddf48add198c6d5ee74017aa57c6bb50dcaa7a67290ba2c"

RPROVIDES:${PN} += "ghc-hjsmin \
libHShjsmin-0.2.1-E05vLEwNeV76Uzm2zhD4uI-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSlanguage-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSutf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
