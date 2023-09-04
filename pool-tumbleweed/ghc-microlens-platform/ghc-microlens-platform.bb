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

RPM_NAME = "ghc-microlens-platform-0.4.3.3-2.6.aarch64.rpm"
RPM_HASH = "c5e5fcc07ed1b8b4392bc41beec3013e44a19dbb789a7d56b009d91295496814efacab229a1e24fbe90994ddc38ea22fc071214a1eca8091dbcf85f45ecfc3a2"

RPROVIDES:${PN} += "ghc-microlens-platform \
libHSmicrolens-platform-0.4.3.3-6gUOWhUsYyX8InoICo3xk0-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so \
libHSmicrolens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89-ghc9.4.6.so \
libHSmicrolens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h-ghc9.4.6.so \
libHSmicrolens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSprimitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku-ghc9.4.6.so \
libHSvector-stream-0.1.0.0-8LsAqgetBjY3tBdh3HDYEB-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
