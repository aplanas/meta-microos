SUMMARY = "Pretty printer for data types with a 'Show' instance"
DESCRIPTION = "Pretty printer for data types with a 'Show' instance."
LICENSE = "BSD-3-Clause"

PV = "4.1.2.0"

RPM_NAME = "ghc-pretty-simple-4.1.2.0-1.3.aarch64.rpm"
RPM_HASH = "6bcca9784c5a10091fdd22956b6999d33bd6e86967e39d5b7eb744ae8d3fb2b7cf3eac895cfa6f36bad3a6a3babbefa6790ec67e130e584b64ae3e5c06781fa4"

RPROVIDES:${PN} += "ghc-pretty-simple ghc-pretty-simple(aarch-64) libHSpretty-simple-4.1.2.0-LfjX2FlO3KCJ7V5IZrf6zY-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2-ghc9.4.5.so()(64bit) libHSprettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
