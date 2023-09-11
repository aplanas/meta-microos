SUMMARY = "Haskell implementation of a javascript minifier"
DESCRIPTION = "Reduces size of javascript files by stripping out extraneous whitespace and \
other syntactic elements, without changing the semantics."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-0.2.1-1.8.aarch64.rpm"
RPM_HASH = "61138f5ec0090de80ace2408e62f6daea9f42b8a73b3899447cb901f8bddca92310953a4f1c9abb3a271309179b19c228d18b00aa49bf589b5e860e0ab43da02"

RPROVIDES:${PN} += "ghc-hjsmin \
libHShjsmin-0.2.1-5GDclcDeF3LDFr0332m90w-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSlanguage-javascript-0.7.1.0-5tkeoDchqnObRztPRYxz4-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSutf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
