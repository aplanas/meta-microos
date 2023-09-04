SUMMARY = "Integer logarithms"
DESCRIPTION = "'Math.NumberTheory.Logarithms' and 'Math.NumberTheory.Powers.Integer' from the \
arithmoi package. \
 \
Also provides 'GHC.Integer.Logarithms.Compat' and \
'Math.NumberTheory.Power.Natural' modules, as well as some additional functions \
in migrated modules."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-1.0.3.1-6.6.aarch64.rpm"
RPM_HASH = "13e9fca28394bec51071cf53390c511b41630bd435a32f43450c3b7aca221d09a997fb8c662c6073c44f4628dbe03f0c748b227d8235e7c2a8cb2507c2c18354"

RPROVIDES:${PN} += "ghc-integer-logarithms \
libHSinteger-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
