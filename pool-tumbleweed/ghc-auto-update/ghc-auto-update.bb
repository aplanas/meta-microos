SUMMARY = "Efficiently run periodic, on-demand actions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/auto-update>."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-0.1.6-6.6.aarch64.rpm"
RPM_HASH = "36e9e575a535d22c0a8c8787bd05605d3509166a9fa19e29bc5fcd95faa754ceb87a86d20f0948284b0304903f942b4eb52b74d0ae809236c8ca12f3be7d5490"

RPROVIDES:${PN} += "ghc-auto-update \
libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
