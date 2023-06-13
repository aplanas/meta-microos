SUMMARY = "Anaphoric and miscellaneous useful control-flow"
DESCRIPTION = "Anaphoric and miscellaneous useful control-flow."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-0.85-4.2.aarch64.rpm"
RPM_HASH = "bfc1d0136c9df5d00ef8cd73c97675632c7dfcd972e93037bda2b16f9c474ba2934566d46a82abcdcee8d454ea461ee9e97b4b7afab9d0b136ecaee269893d57"

RPROVIDES:${PN} += "ghc-IfElse \
ghc-IfElse(aarch-64) \
libHSIfElse-0.85-7KBtFS87aFz8e1Xg4MUrMX-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
