SUMMARY = "Netlink communication for Haskell"
DESCRIPTION = "Library to comminicate with Linux kernel via Netlink."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-1.1.1.0-4.3.aarch64.rpm"
RPM_HASH = "e11c4bea7efe5a9e74bad2de5af3f38a33a436b515a79fed48434097c2db10243ac039c6b45c99f548e940b5bffb2c1d056a9f3a42bab0925cbbf14b56c388d3"

RPROVIDES:${PN} += "ghc-netlink \
ghc-netlink(aarch-64) \
libHSnetlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmonad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSpretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libffi.so.8()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libnuma.so.1()(64bit)"

inherit rpm
