SUMMARY = "Netlink communication for Haskell"
DESCRIPTION = "Library to comminicate with Linux kernel via Netlink."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-1.1.1.0-4.8.aarch64.rpm"
RPM_HASH = "22ce2834780179e7e02b0bcf5509f51f3f92a99281e21986a959549a70c7359f6f2da95220348f55191079fdb3ec408947384ca54f1bd7e271564221800e71c9"

RPROVIDES:${PN} += "ghc-netlink \
libHSnetlink-1.1.1.0-AkYwYtaCv1eG7Xks1z5IhU-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmonad-loops-0.4.3-Hqvq9oJQAvl8Gm82ocTn8i-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSpretty-hex-1.1-6nqTsc1Xx7vJSzZ0xX5VyC-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
