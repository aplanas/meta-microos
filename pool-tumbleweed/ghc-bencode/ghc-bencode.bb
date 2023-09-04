SUMMARY = "Parsers and printers for bencoded data"
DESCRIPTION = "Parsers and printers for bencoded data. Bencode (pronounced like B encode) is \
the encoding used by the peer-to-peer file sharing system BitTorrent for \
storing and transmitting loosely structured data."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-0.6.1.1-4.8.aarch64.rpm"
RPM_HASH = "536673bc7df55da1657d957d5fdf3fc73db75d063029f30672c8669143501900fe516ab2a1549c850b5d0137a5529d7497c6ba8d39faa379c898c6c31efbfdff"

RPROVIDES:${PN} += "ghc-bencode \
libHSbencode-0.6.1.1-26x5GmL2BHOEu40VootDht-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
