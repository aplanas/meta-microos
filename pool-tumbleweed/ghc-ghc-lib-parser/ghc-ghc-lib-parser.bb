SUMMARY = "The GHC API, decoupled from GHC versions"
DESCRIPTION = "A package equivalent to the 'ghc' package, but which can be loaded on many \
compiler versions."
LICENSE = "BSD-3-Clause"

PV = "9.4.7.20230826"

RPM_NAME = "ghc-ghc-lib-parser-9.4.7.20230826-1.1.aarch64.rpm"
RPM_HASH = "a74cf74b0d5a36fef7c9d76d629b34735c891f1915691d0196056782f658b3e21ee2a60bc246e88690b1bae564dc45486850787282fbc33ef0f729f6c5e2e945"

RPROVIDES:${PN} += "ghc-ghc-lib-parser \
libHSghc-lib-parser-9.4.7.20230826-9jTyF2CzAjoBitf2gKlSVU-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSexceptions-0.10.5-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprocess-1.6.17.0-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
