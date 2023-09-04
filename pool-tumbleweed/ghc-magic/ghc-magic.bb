SUMMARY = "Interface to C file/magic library"
DESCRIPTION = "This package provides a Haskell interface to the C libmagic library. \
With it, you can determine the type of a file by examining its contents rather \
than its name. The Haskell interface provides a full-featured binding."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-1.1-4.8.aarch64.rpm"
RPM_HASH = "fe41fbdc9fb15410baa0793ea1a5324c23bbff33c2ae4f975c1b6bbc8f145a790fb02d5462b7445a305338cd570ed4d5e1eead660c340fbf6f0936a2332d54e0"

RPROVIDES:${PN} += "ghc-magic \
libHSmagic-1.1-I7L3tCx2kmTIw2Fco7m622-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmagic.so.1"

inherit rpm
