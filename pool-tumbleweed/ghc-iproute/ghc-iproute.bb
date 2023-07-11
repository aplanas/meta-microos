SUMMARY = "IP Routing Table"
DESCRIPTION = "IP Routing Table is a tree of IP ranges to search one of them on the longest \
match base. It is a kind of TRIE with one way branching removed. Both IPv4 and \
IPv6 are supported."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-1.7.12-2.7.aarch64.rpm"
RPM_HASH = "1cae2317a1ada0f4797a752369bc63de32e7355d7f225f1b206da07da52b8579772c4291395e1235036ef8120ae4ba2cfc93b632ff49cf55c003f74baecbccac"

RPROVIDES:${PN} += "ghc-iproute \
libHSiproute-1.7.12-IhoklPQYItb8qGu1G3vmcD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
