SUMMARY = "Lua module to work with file paths"
DESCRIPTION = "Lua module to work with file paths in a platform independent way."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "1b585eaa7a53108dfa7074220e32d3a0b752896bd00b1d95415eee9528052f8d39d9676172379d8d26124c65874c574fda1d27835cc240f25cf9fb08e3824590"

RPROVIDES:${PN} += "ghc-hslua-module-path \
libHShslua-module-path-1.1.0-3XIGPd4cIDuFY6K1e1WFz9-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
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
