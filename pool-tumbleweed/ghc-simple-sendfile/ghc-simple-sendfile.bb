SUMMARY = "Cross platform library for the sendfile system call"
DESCRIPTION = "Cross platform library for the sendfile system call. This library tries to call \
minimum system calls which are the bottleneck of web servers."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-0.2.32-1.2.aarch64.rpm"
RPM_HASH = "27c7f452cecd423076c791a892e47599e874da5a61be9e83870e10eaf98fc8e5d338c44bce5a8be9b2441feead36f0c78bf319fea10b2081539f32e86111edce"

RPROVIDES:${PN} += "ghc-simple-sendfile \
libHSsimple-sendfile-0.2.32-4x5oTHfDDcT2QYoR9wedVb-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSnetwork-3.1.4.0-FvtFepOtuCUH79FCWyNxIc-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
