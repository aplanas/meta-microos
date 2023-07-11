SUMMARY = "Parsers and printers for bencoded data"
DESCRIPTION = "Parsers and printers for bencoded data. Bencode (pronounced like B encode) is \
the encoding used by the peer-to-peer file sharing system BitTorrent for \
storing and transmitting loosely structured data."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-0.6.1.1-4.6.aarch64.rpm"
RPM_HASH = "6fbecbbe338c04cd2882d068ef71f5b9e75288292867358c9c51aae7350903be0e8e5cf204b00123b4158763fcdf4a35221cd68a68a8cd07ff0dc88afe2ccc57"

RPROVIDES:${PN} += "ghc-bencode \
libHSbencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
