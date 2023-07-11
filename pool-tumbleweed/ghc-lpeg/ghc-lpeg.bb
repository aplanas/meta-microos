SUMMARY = "LPeg – Parsing Expression Grammars For Lua"
DESCRIPTION = "This package contains the C sources of LPeg, as well as some tiny Haskell \
helper to load the package. \
 \
<http://www.inf.puc-rio.br/~roberto/lpeg/>."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-1.0.4-1.4.aarch64.rpm"
RPM_HASH = "56fffc3f960d979dd0ed4e83a81c031973e9eb7e2c69efde65df853df5331d8f7c60d6abc865c4a3fcbab2520224f159036e90dba3547479a14c5dae67c2a9c0"

RPROVIDES:${PN} += "ghc-lpeg \
libHSlpeg-1.0.4-IadFjeA522fGKCuUXCvVP9-ghc9.4.5.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
