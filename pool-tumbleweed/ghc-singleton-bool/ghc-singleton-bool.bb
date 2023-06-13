SUMMARY = "Type level booleans"
DESCRIPTION = "Type level booleans. \
 \
'singletons' package provides similar functionality, but it has tight \
dependency constraints."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "0d7002f66825f479c2a140194ed69fb899297a4230341098a76df38c02679517a02d0fe464df59fc99b302506a404696c063beed4c68f7795b08d0a05f17ed33"

RPROVIDES:${PN} += "ghc-singleton-bool \
ghc-singleton-bool(aarch-64) \
libHSsingleton-bool-0.1.6-9MbEj8pBx4EB1jZ66FdPc4-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSboring-0.2.1-J8lJX6Vz53r2bssyBwOtpl-ghc9.4.5.so()(64bit) \
libHSdec-0.0.5-4k85S2UkQTWCpK3j0IuOFm-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSsome-1.0.5-3dwCpkSImpx8T8axxRPR3Z-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
