SUMMARY = "BitTorrent file parser and generater"
DESCRIPTION = "BitTorrent file parser and generater."
LICENSE = "BSD-3-Clause"

PV = "10000.1.3"

RPM_NAME = "ghc-torrent-10000.1.3-1.3.aarch64.rpm"
RPM_HASH = "dd7563715e608bce10fe31c5436a12dd9d43302f4ce41ded62fdd4bad18b8d765390ea1c55937f070477cd9f2210d5eccae6e158f7513be0d53a64ec4e55690f"

RPROVIDES:${PN} += "ghc-torrent \
libHStorrent-10000.1.3-6s7CFs4CbkZ3Yp9HO0y2ZH-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSsyb-0.7.2.3-J0Qw7O8gTR0DSXObDhEt8i-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
