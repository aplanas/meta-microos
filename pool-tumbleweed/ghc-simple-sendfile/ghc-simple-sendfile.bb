SUMMARY = "Cross platform library for the sendfile system call"
DESCRIPTION = "Cross platform library for the sendfile system call. This library tries to call \
minimum system calls which are the bottleneck of web servers."
LICENSE = "BSD-3-Clause"

PV = "0.2.31"

RPM_NAME = "ghc-simple-sendfile-0.2.31-1.1.aarch64.rpm"
RPM_HASH = "962b1b3dd4f12d49eb9ef940e7aae6eca92cbe622ad81fffe100fdfb77f3274af8866c04fe4ad58b7386246a5520d83abd26d409d79d584c7a9551aae629bc41"

RPROVIDES:${PN} += "ghc-simple-sendfile \
ghc-simple-sendfile(aarch-64) \
libHSsimple-sendfile-0.2.31-701wssQD34oFyvrTLOblUT-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSnetwork-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
