SUMMARY = "Haskell binding to inotify"
DESCRIPTION = "This library provides a wrapper to the Linux Kernel's inotify feature, allowing \
applications to subscribe to notifications when a file is accessed or modified."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-0.4.1-3.4.aarch64.rpm"
RPM_HASH = "7c6b59948b0a3c87e06f2124f12b341c568e0ca6c2bc1540e0f5c9f84d1b16d8ad99d715f9d7a1959384bd0ac3b6b5afca9c7b49a92d329990f0b469665af2fd"

RPROVIDES:${PN} += "ghc-hinotify \
libHShinotify-0.4.1-JFQ6DOM0mgyCikOfj8YmfP-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
