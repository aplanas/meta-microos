SUMMARY = "Haskell ghc library"
DESCRIPTION = "This package provides the Haskell ghc library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "75b133da0de9f823a4999dac9ec1f094f60dfde8640b4a9efa2144393853ac5ef9057117283d3c597efbb2f1f5ecb76539bf07831d7ea123081acc8773f4bb39"

RPROVIDES:${PN} += "ghc-ghc \
libHSghc-9.4.5-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSexceptions-0.10.5-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-9.4.5-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-heap-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSghci-9.4.5-ghc9.4.5.so \
libHShpc-0.6.1.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHSterminfo-0.4.1.5-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
