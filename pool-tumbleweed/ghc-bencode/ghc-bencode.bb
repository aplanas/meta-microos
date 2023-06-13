SUMMARY = "Parsers and printers for bencoded data"
DESCRIPTION = "Parsers and printers for bencoded data. Bencode (pronounced like B encode) is \
the encoding used by the peer-to-peer file sharing system BitTorrent for \
storing and transmitting loosely structured data."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-0.6.1.1-4.3.aarch64.rpm"
RPM_HASH = "2ccf223dfeb81d0f11cffc68ee0609bb9948c3124370109ca59c450fa935ed60cdbc1be4950bf14426b9818e87faa8ef745bd5b5c3a4f17e9465e0251d984fb4"

RPROVIDES:${PN} += "ghc-bencode \
ghc-bencode(aarch-64) \
libHSbencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
