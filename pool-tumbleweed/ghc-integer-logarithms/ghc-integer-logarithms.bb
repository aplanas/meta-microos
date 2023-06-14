SUMMARY = "Integer logarithms"
DESCRIPTION = "'Math.NumberTheory.Logarithms' and 'Math.NumberTheory.Powers.Integer' from the \
arithmoi package. \
 \
Also provides 'GHC.Integer.Logarithms.Compat' and \
'Math.NumberTheory.Power.Natural' modules, as well as some additional functions \
in migrated modules."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-1.0.3.1-6.3.aarch64.rpm"
RPM_HASH = "32084d41534689c7a892883fb7c5aa71c0896781b18c8e330705bd3ffffcd11c780e78e0549ce6b5e8e6277142face6b851a2637facd33081d8f096fd31fae79"

RPROVIDES:${PN} += "ghc-integer-logarithms \
libHSinteger-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
