SUMMARY = "Data.Type.Equality compat package"
DESCRIPTION = "This library defines a propositional equality data type, shims \
'Data.Type.Equality' as well as possible for older GHCs (< 7.8). \
 \
' data a :~: b where Refl :: a :~: a ' \
 \
The module 'Data.Type.Equality.Hetero' shims ':~~:' equality, for compilers \
with 'PolyKinds'."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-1-11.3.aarch64.rpm"
RPM_HASH = "2dd255274bc5306af25fc83e1ea350d2d3e873c60cfe99b5109eceed539c12b775c021741d95a12abfdd98e0bf3ac241eff8f0055962350e56c1d3eabd6d2a5f"

RPROVIDES:${PN} += "ghc-type-equality \
libHStype-equality-1-GeDZojRKCH6645jDbV5JLU-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
