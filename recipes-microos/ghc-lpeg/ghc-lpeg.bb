SUMMARY = "LPeg – Parsing Expression Grammars For Lua"
DESCRIPTION = "This package contains the C sources of LPeg, as well as some tiny Haskell \
helper to load the package. \
 \
<http://www.inf.puc-rio.br/~roberto/lpeg/>."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "ghc-lpeg-1.0.4-1.3.aarch64.rpm"
RPM_HASH = "8c9a83fb77f73d42ecc6a91a96b8e546c49d7c8cac11f5ea13b3adf463a057af51f464d2a16b3204ab77fda0569084c09d9d99ae0af263f979f23d9b507d266f"

RPROVIDES:${PN} += "ghc-lpeg ghc-lpeg(aarch-64) libHSlpeg-1.0.4-IadFjeA522fGKCuUXCvVP9-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSlua-2.3.1-16mGxirchUh4T3oJJYdFzu-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
