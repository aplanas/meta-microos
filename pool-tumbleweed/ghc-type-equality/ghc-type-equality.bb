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

RPM_NAME = "ghc-type-equality-1-11.2.aarch64.rpm"
RPM_HASH = "45eca215c44b9dbd54ebe0ec965c4e40b77c7d4ffaf77cc665b8bffb07d64d0e9674c07df51978cff86a537b0117527df1c1c537149046776a247683579892f6"

RPROVIDES:${PN} += "ghc-type-equality \
ghc-type-equality(aarch-64) \
libHStype-equality-1-FqVAbwBXnIKCXHvrA6xdY8-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
