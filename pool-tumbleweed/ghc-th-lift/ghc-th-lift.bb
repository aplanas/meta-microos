SUMMARY = "Derive Template Haskell's Lift class for datatypes"
DESCRIPTION = "Derive Template Haskell's 'Lift' class for datatypes using 'TemplateHaskell'. \
The functionality in this package has largely been subsumed by the 'DeriveLift' \
language extension, which is available in GHC 8.0 and later versions. \
This package can still be useful as a uniform way to derive 'Lift' instances \
that is backwards-compatible with older GHCs. \
 \
The following libraries are related: \
 \
* The <https://hackage.haskell.org/package/th-orphans th-orphans> package \
provides instances for 'template-haskell' syntax types. \
 \
* The <http://hackage.haskell.org/package/th-lift-instances th-lift-instances> \
package provides 'Lift' instances for types in 'base', 'text', 'bytestring', \
'vector', etc. Some of these instances are only provided for old versions of \
their respective libraries, as the same 'Lift' instances are also present \
upstream on newer versions."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.4"

RPM_NAME = "ghc-th-lift-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "834405c73c31ada865856bc193f64757f13ab0103c30d63dc87fa294f928f49a593ef3c31cce34bc0ab33b84bab3578584b32b509210bb5f00e0bf9df50fcb0a"

RPROVIDES:${PN} += "ghc-th-lift \
libHSth-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
