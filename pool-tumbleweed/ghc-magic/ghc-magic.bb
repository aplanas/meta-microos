SUMMARY = "Interface to C file/magic library"
DESCRIPTION = "This package provides a Haskell interface to the C libmagic library. \
With it, you can determine the type of a file by examining its contents rather \
than its name. The Haskell interface provides a full-featured binding."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-1.1-4.6.aarch64.rpm"
RPM_HASH = "2f30c7c3ad79674765cba2f769121636a3b44f59e1e3cd89152257fe826409635c0cb49c6ac1414bfdf8706c2f22b27a4e6885f0dd55f4986823c651b19ccf83"

RPROVIDES:${PN} += "ghc-magic \
libHSmagic-1.1-FZjtT3pxmlr6oRrs4QNuLe-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmagic.so.1"

inherit rpm
