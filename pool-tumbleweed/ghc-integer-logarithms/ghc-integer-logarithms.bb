SUMMARY = "Integer logarithms"
DESCRIPTION = "'Math.NumberTheory.Logarithms' and 'Math.NumberTheory.Powers.Integer' from the \
arithmoi package. \
 \
Also provides 'GHC.Integer.Logarithms.Compat' and \
'Math.NumberTheory.Power.Natural' modules, as well as some additional functions \
in migrated modules."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-1.0.3.1-6.5.aarch64.rpm"
RPM_HASH = "dd185b25cd4e3d94f141d20408c8a3c717b843975de86e601cce60706ac14245274cd18c3ac5c8ed20c7e55b7341121f125b70490e4b386afc1983b0f2f6728e"

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
