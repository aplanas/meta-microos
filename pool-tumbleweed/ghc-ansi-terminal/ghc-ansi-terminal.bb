SUMMARY = "Simple ANSI terminal support, with Windows compatibility"
DESCRIPTION = "ANSI terminal support for Haskell: allows cursor movement, screen clearing, \
color output, showing or hiding the cursor, and changing the title. \
Works on UNIX and Windows."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "076ca6e5aa787fbfe2718032872b8356d6f5c8b3a522972fea00cacaf9b86d3248f6fe65ee711c22086bacebe879d07e4473d1f98951c6b44e9dcff14dc33e33"

RPROVIDES:${PN} += "ghc-ansi-terminal \
libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
