SUMMARY = "Command-line interface for Lua"
DESCRIPTION = "Provides an embeddable command-line interface for Lua. The interface is \
compatible with the standard Lua interpreter, i.e., the `lua` executable \
provided in a default Lua installation."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "a290df9b3ceb5d1819ca14dfbf66b4658f9bf5ae27a38a83d8f57f156d22f23538fecfc023361db86149c304a8ebfc8f5935a30c038e71cd8fadaefc0418e155"

RPROVIDES:${PN} += "ghc-hslua-cli \
libHShslua-cli-1.4.1-3ALOS2CE98w5DVmGh3IYfg-ghc9.4.6.so"

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
libHShslua-repl-0.1.1-AT3e5G0H4So5vj4IgGLSDC-ghc9.4.6.so \
libHSisocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b-ghc9.4.6.so \
libHSlua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
