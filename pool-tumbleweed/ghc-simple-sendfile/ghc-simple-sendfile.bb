SUMMARY = "Cross platform library for the sendfile system call"
DESCRIPTION = "Cross platform library for the sendfile system call. This library tries to call \
minimum system calls which are the bottleneck of web servers."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-0.2.32-1.4.aarch64.rpm"
RPM_HASH = "64b388db01f871200907ec96d98ec519abd201574288d3b5b15e19058ffefab9ec58d3a6da7216c71baf8928cce4cbc838c7afa52bf2e0a97f7660ab0de0fa1f"

RPROVIDES:${PN} += "ghc-simple-sendfile \
libHSsimple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
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
