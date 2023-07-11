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

RPM_NAME = "ghc-microlens-platform-0.4.3.3-2.4.aarch64.rpm"
RPM_HASH = "d1b7f51111037969a2e7e62f65fc53e225b6f4789ae0f177c1beb2c24fb9569931ebc5c4000cfb973a1c767da05067bb6ea9369334b3e158a914df94ed43c150"

RPROVIDES:${PN} += "ghc-microlens-platform \
libHSmicrolens-platform-0.4.3.3-Cix3OOw3ZFyD9flb3xi2EO-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmicrolens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1-ghc9.4.5.so \
libHSmicrolens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB-ghc9.4.5.so \
libHSmicrolens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV-ghc9.4.5.so \
libHSmicrolens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHSth-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
