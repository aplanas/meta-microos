SUMMARY = "GHC compiler and utilities"
DESCRIPTION = "This package contains the GHC compiler, tools and utilities. \
 \
The GHC libraries are provided by ghc-devel. \
To install all of GHC install package ghc."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-compiler-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "eb47df6e551746538b7647c025aa07cca606f52c68679853bac767979831445a77e11111a8e1bdd2de10c8e7cf51e7570ffbab6d11256f2d3ebfc4b9293e54b8"

RPROVIDES:${PN} += "ghc-compiler \
hsc2hs-0.68.8-1.1"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
ghc-base-devel \
ghc-filesystem \
libHSCabal-3.8.1.0-ghc9.4.6.so \
libHSCabal-syntax-3.8.1.0-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-9.4.6-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-9.4.6-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-heap-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSghci-9.4.6-ghc9.4.6.so \
libHShaskeline-0.8.2-ghc9.4.6.so \
libHShpc-0.6.1.0-ghc9.4.6.so \
libHSlibiserv-9.4.6-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSrts-1.0.2-ghc9.4.6.so \
libHSrts-1.0.2-thr-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSterminfo-0.4.1.5-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSxhtml-3000.2.2.1-ghc9.4.6.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
