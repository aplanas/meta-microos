SUMMARY = "GHC compiler and utilities"
DESCRIPTION = "This package contains the GHC compiler, tools and utilities. \
 \
The GHC libraries are provided by ghc-devel. \
To install all of GHC install package ghc."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-compiler-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "f53f352d5ab0f8ce4b7c22b0fa5e7c9fb5d15ef2b969898fb2c11bdb00c978ed1ae9a9196b6ea5474c4ae0f4530f26c821e7a35562c4b465131f77e9d5f2ae6d"

RPROVIDES:${PN} += "ghc-compiler ghc-compiler(aarch-64) hsc2hs-0.68.8-3.1"
RDEPENDS:${PN} += "/bin/sh gcc ghc-base-devel ghc-filesystem libHSCabal-3.8.1.0-ghc9.4.5.so()(64bit) libHSCabal-syntax-3.8.1.0-ghc9.4.5.so()(64bit) libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHScontainers-0.6.7-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) libHSexceptions-0.10.5-ghc9.4.5.so()(64bit) libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) libHSghc-9.4.5-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-9.4.5-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-heap-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSghci-9.4.5-ghc9.4.5.so()(64bit) libHShaskeline-0.8.2-ghc9.4.5.so()(64bit) libHShpc-0.6.1.0-ghc9.4.5.so()(64bit) libHSlibiserv-9.4.5-ghc9.4.5.so()(64bit) libHSmtl-2.2.2-ghc9.4.5.so()(64bit) libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) libHSrts-1.0.2-ghc9.4.5.so()(64bit) libHSrts-1.0.2_thr-ghc9.4.5.so()(64bit) libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHSterminfo-0.4.1.5-ghc9.4.5.so()(64bit) libHStext-2.0.2-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libHSxhtml-3000.2.2.1-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
