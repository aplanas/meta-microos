SUMMARY = "Haskell implementation of a javascript minifier"
DESCRIPTION = "Reduces size of javascript files by stripping out extraneous whitespace and \
other syntactic elements, without changing the semantics."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-0.2.1-1.7.aarch64.rpm"
RPM_HASH = "e3c3f06e0cdf1dac9e2df9719f621db62ce039e598ed790fee61614b50b365e49da4de6538111e8fb777ac0bb1ef9bbf490946c1fe03fe821f7e7dffcf891b37"

RPROVIDES:${PN} += "ghc-hjsmin \
libHShjsmin-0.2.1-1Nqa77EAma94x2VWIbRoKX-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSlanguage-javascript-0.7.1.0-LEIqziehkytABOWYmhOylg-ghc9.4.6.so \
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
