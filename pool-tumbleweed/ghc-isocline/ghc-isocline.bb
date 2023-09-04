SUMMARY = "A portable alternative to GNU Readline"
DESCRIPTION = "![logo](https://raw.githubusercontent.com/daanx/isocline/main/doc/isocline-inline.svg) \
A Haskell wrapper around the [Isocline C \
library](https://github.com/daanx/isocline#readme) which can provide an \
alternative to GNU Readline. (The Isocline library is included whole and there \
are no runtime dependencies). Please see the \
[readme](https://github.com/daanx/isocline/haskell#readme) on GitHub for more \
information."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-1.0.9-1.8.aarch64.rpm"
RPM_HASH = "74796b796e571e21b6b0b7c85f52bb786650c344baccd0fb057c39f8c5678dc4370479beb7f2b84c20c23567bd50f2463d2eb2f3c98174c57b8e9cb88550f81a"

RPROVIDES:${PN} += "ghc-isocline \
libHSisocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
