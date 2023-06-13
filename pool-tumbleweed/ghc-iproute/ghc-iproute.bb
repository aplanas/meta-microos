SUMMARY = "IP Routing Table"
DESCRIPTION = "IP Routing Table is a tree of IP ranges to search one of them on the longest \
match base. It is a kind of TRIE with one way branching removed. Both IPv4 and \
IPv6 are supported."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-1.7.12-2.3.aarch64.rpm"
RPM_HASH = "7982a083dbbdd0639b8e4ad592ffc6841f36bc6d75ab7743611e6697bf31089a61bcc779f52a56842fd07f3f9465e8b6b3b0ebeeda85c0137f5fbbcff8414bd1"

RPROVIDES:${PN} += "ghc-iproute \
ghc-iproute(aarch-64) \
libHSiproute-1.7.12-2mj2MFOMRz35bHY4Q7Jvyd-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSappar-0.1.8-JYpyJYPkUOgKorqU8WSWRv-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbyteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
