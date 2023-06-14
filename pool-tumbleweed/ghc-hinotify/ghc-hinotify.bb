SUMMARY = "Haskell binding to inotify"
DESCRIPTION = "This library provides a wrapper to the Linux Kernel's inotify feature, allowing \
applications to subscribe to notifications when a file is accessed or modified."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-0.4.1-3.2.aarch64.rpm"
RPM_HASH = "9d04c3dbf1763d193cb35bf435cba87ea57d83effeeb1356ce6aacaae9791b022de63b5c389e266aec99652584a7b1572846a9697c080c8222101cb13895bf19"

RPROVIDES:${PN} += "ghc-hinotify \
libHShinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
