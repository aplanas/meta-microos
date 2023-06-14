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

RPM_NAME = "ghc-isocline-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "a4fddfb2e6f96c2ceab1e317a699e0b15ea8ad9bf42def75c8afec8ee1101a2ace6d658013e929bed8d9ef72d87e12d78b9d841e3dd6ee2da611f72db5e27a11"

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
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
