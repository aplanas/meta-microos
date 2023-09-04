SUMMARY = "Additional types of channels for STM"
DESCRIPTION = "Additional types of channels for STM."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-3.0.0.9-1.8.aarch64.rpm"
RPM_HASH = "8b749349eb6bcf4261a52ef8ae7d112d9d8deab26f26bf2a8de860d95ced7f823e3466323ef49eb7c0084589419fb8bf833bcf6f72d6823449ac4008d17d5336"

RPROVIDES:${PN} += "ghc-stm-chans \
libHSstm-chans-3.0.0.9-HC5DzDy937dJnRBWxlJfuc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
