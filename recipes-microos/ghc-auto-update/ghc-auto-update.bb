SUMMARY = "Efficiently run periodic, on-demand actions"
DESCRIPTION = "API docs and the README are available at \
<http://www.stackage.org/package/auto-update>."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-0.1.6-6.3.aarch64.rpm"
RPM_HASH = "245f51cd8f3166e428ea38a0c9a26e6faa56a6e1f4503c9fdd97656e14db2073158cdad1a1c09a7a0d10c7d5987681a0e551bc3ee982a0f3f61b00e672b869f3"

RPROVIDES:${PN} += "ghc-auto-update ghc-auto-update(aarch-64) libHSauto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
