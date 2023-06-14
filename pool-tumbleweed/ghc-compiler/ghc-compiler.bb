SUMMARY = "GHC compiler and utilities"
DESCRIPTION = "This package contains the GHC compiler, tools and utilities. \
 \
The GHC libraries are provided by ghc-devel. \
To install all of GHC install package ghc."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-compiler-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "f53f352d5ab0f8ce4b7c22b0fa5e7c9fb5d15ef2b969898fb2c11bdb00c978ed1ae9a9196b6ea5474c4ae0f4530f26c821e7a35562c4b465131f77e9d5f2ae6d"

RPROVIDES:${PN} += "ghc-compiler \
hsc2hs-0.68.8-3.1"

RDEPENDS:${PN} += "/bin/sh \
gcc \
ghc-base-devel \
ghc-filesystem \
libHSCabal-3.8.1.0-ghc9.4.5.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-9.4.5-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-9.4.5-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-heap-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSghci-9.4.5-ghc9.4.5.so \
libHShaskeline-0.8.2-ghc9.4.5.so \
libHShpc-0.6.1.0-ghc9.4.5.so \
libHSlibiserv-9.4.5-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSparsec-3.1.16.1-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrts-1.0.2-ghc9.4.5.so \
libHSrts-1.0.2-thr-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHSterminfo-0.4.1.5-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSxhtml-3000.2.2.1-ghc9.4.5.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
