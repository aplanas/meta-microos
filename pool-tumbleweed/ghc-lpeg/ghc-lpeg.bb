SUMMARY = "LPeg – Parsing Expression Grammars For Lua"
DESCRIPTION = "This package contains the C sources of LPeg, as well as some tiny Haskell \
helper to load the package. \
 \
<http://www.inf.puc-rio.br/~roberto/lpeg/>."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-1.0.4-1.5.aarch64.rpm"
RPM_HASH = "0f21fae7cee44e4a1f4cc3a166e3a98f4774dafd3f366b58c493f2163e7c9c90c0ee2a4fec795129e6cbb26defa545f9f8628a3a2e53e6928650a080708d3d6c"

RPROVIDES:${PN} += "ghc-lpeg \
libHSlpeg-1.0.4-DiPCMqCZ1gDFL4TQ30W98B-ghc9.4.6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
