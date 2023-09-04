SUMMARY = "Efficiently run periodic, on-demand actions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/auto-update>."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-0.1.6-6.8.aarch64.rpm"
RPM_HASH = "726bc7a9da33c692bb26bfe1d1b987c85bdc2038fe17fd1efa28b88b77cb4f915f3801d469547245faf9b5404dfce2db2266c72b243df168c40a6b4e9500bc9e"

RPROVIDES:${PN} += "ghc-auto-update \
libHSauto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
