SUMMARY = "BitTorrent file parser and generater"
DESCRIPTION = "BitTorrent file parser and generater."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-10000.1.3-1.9.aarch64.rpm"
RPM_HASH = "cfaf1c03ba2cf0cfb897cd3dc5c16f26ffacf2f84441d04f7f831dcfda5885f82566f9bf5af3dc18f6e2d7218d06c32c0f323f9f36d489cde59a3b9d29daf4e4"

RPROVIDES:${PN} += "ghc-torrent \
libHStorrent-10000.1.3-G2wBML2oDMy6AdmYQo4Dlc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbencode-0.6.1.1-26x5GmL2BHOEu40VootDht-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSsyb-0.7.2.4-URkW17Cd7D7rpu7G0BDIE-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
