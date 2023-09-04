SUMMARY = "IP Routing Table"
DESCRIPTION = "IP Routing Table is a tree of IP ranges to search one of them on the longest \
match base. It is a kind of TRIE with one way branching removed. Both IPv4 and \
IPv6 are supported."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-1.7.12-2.9.aarch64.rpm"
RPM_HASH = "91f6fd0a7223ec4485629d011482795df3e11ca535fecd615e60f576f32f528afdb3fd4459daaec1e68912812f26b8fca5f0d56e1ea505f9a913d0925551045e"

RPROVIDES:${PN} += "ghc-iproute \
libHSiproute-1.7.12-A34D1N9dJmL5ps3agDCHa7-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSappar-0.1.8-1lWb1vtDAvc6rz1D87iAo-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
