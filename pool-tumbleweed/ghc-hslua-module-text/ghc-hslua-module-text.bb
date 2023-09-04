SUMMARY = "Lua module for text"
DESCRIPTION = "UTF-8 aware subset of Lua's `string` module. \
 \
This package is part of HsLua, a Haskell framework built around the embeddable \
scripting language <https://lua.org Lua>."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "665a77b37c0bd34027f2918ef3ad980493c76d931e4b147e46e35be954cf49b64015740ab4d1098334669634355b162f61156bc26f03f21011dbf0f3a03a5be4"

RPROVIDES:${PN} += "ghc-hslua-module-text \
libHShslua-module-text-1.1.0.1-3IzHe65h4nzA5y3IIyP0nc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk-ghc9.4.6.so \
libHShslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj-ghc9.4.6.so \
libHShslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS-ghc9.4.6.so \
libHShslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD-ghc9.4.6.so \
libHShslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn-ghc9.4.6.so \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
