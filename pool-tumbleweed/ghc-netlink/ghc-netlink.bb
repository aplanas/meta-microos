SUMMARY = "Netlink communication for Haskell"
DESCRIPTION = "Library to comminicate with Linux kernel via Netlink."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-1.1.1.0-4.6.aarch64.rpm"
RPM_HASH = "dddaebaabd03e6bc4cc3abd6386e64b3339ce50a63ceb507e9ed1c82e319846355cc449d3807ed45195160e79645c9f05116e17ac286b98ae65c315bffc8a72f"

RPROVIDES:${PN} += "ghc-netlink \
libHSnetlink-1.1.1.0-3cQkQWnXFQnLtl9CehLMU3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmonad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSpretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
