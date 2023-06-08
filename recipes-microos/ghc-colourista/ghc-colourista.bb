SUMMARY = "Convenient interface for printing colourful messages"
DESCRIPTION = "Convenient interface for printing colourful messages based on the \
'ansi-terminal' library."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-0.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "3aecf38678d6c04bb7d355358d02730ebf798c91e1aaca4372c17708824a096a42b0cc9a99069120ac7230b8047709ddcc530e5153d31dcbbd33f36194457380"

RPROVIDES:${PN} += "ghc-colourista ghc-colourista(aarch-64) libHScolourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
