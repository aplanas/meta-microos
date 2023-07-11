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

RPM_NAME = "ghc-isocline-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "fbd4dfea946126828702e3a0a28db6b02d794485b0aa52da6f512c0168b2b1ad0e43af07ff543ab3f247b9c63411dc0b83dfe57f31d0305fcbe6215793a1763c"

RPROVIDES:${PN} += "ghc-isocline \
libHSisocline-1.0.9-7x8dFWbXh69GJxYhigSqXG-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
