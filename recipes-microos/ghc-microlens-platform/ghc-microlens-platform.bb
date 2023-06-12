SUMMARY = "Microlens + all batteries included (best for apps)"
DESCRIPTION = "This package exports a module which is the recommended starting point for using \
<http://hackage.haskell.org/package/microlens microlens> if you aren't trying \
to keep your dependencies minimal. By importing 'Lens.Micro.Platform' you get \
all functions and instances from <http://hackage.haskell.org/package/microlens \
microlens>, <http://hackage.haskell.org/package/microlens-th microlens-th>, \
<http://hackage.haskell.org/package/microlens-mtl microlens-mtl>, \
<http://hackage.haskell.org/package/microlens-ghc microlens-ghc>, as well as \
instances for 'Vector', 'Text', and 'HashMap'. \
 \
The minor and major versions of microlens-platform are incremented whenever the \
minor and major versions of any other microlens package are incremented, so you \
can depend on the exact version of microlens-platform without specifying the \
version of microlens (microlens-mtl, etc) you need. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme <https://github.com/monadfix/microlens#readme \
on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-0.4.3.3-2.3.aarch64.rpm"
RPM_HASH = "8abcbd595390987cc7b193e520e4b26822f9dd9b91f594f8cfc7dc711774fa7100cb9e031e6b29ddb0210aa4b36f7e37ad2ad64cf502a29a2ca7e49faebd6902"

RPROVIDES:${PN} += "ghc-microlens-platform \
ghc-microlens-platform(aarch-64) \
libHSmicrolens-platform-0.4.3.3-9nLg9j7jRAiHEY5VUSmG6h-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSmicrolens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1-ghc9.4.5.so()(64bit) \
libHSmicrolens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB-ghc9.4.5.so()(64bit) \
libHSmicrolens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV-ghc9.4.5.so()(64bit) \
libHSmicrolens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so()(64bit) \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so()(64bit) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
