SUMMARY = "ANSI terminal backend for the »prettyprinter« package"
DESCRIPTION = "ANSI terminal backend for the »prettyprinter« package."
LICENSE = "BSD-2-Clause"

PV = "1.1.3"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-1.1.3-2.2.aarch64.rpm"
RPM_HASH = "8dabf6ba7cfce72857dde5073ae0c41a2af8a343c212a7efacebaf4d012a8d7236ca9a3c8ea9ba8043ede32d28df06be40366a6b6f338c6fccfac85c2a5540e7"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal \
ghc-prettyprinter-ansi-terminal(aarch-64) \
libHSprettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
