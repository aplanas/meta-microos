SUMMARY = "Types and functions used to represent SGR aspects"
DESCRIPTION = "The 'ANSI' standards refer to the visual style of displaying characters as \
their 'graphic rendition'. The 'ANSI' codes to establish the graphic rendition \
for subsequent text are referred to as SELECT GRAPHIC RENDITION (SGR). \
This package exposes modules that export types and functions used to represent \
SGR aspects."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-0.11.5-1.3.aarch64.rpm"
RPM_HASH = "b9307e3fbb2cfd93d8cc859753e827d30ee3829ce96f27d61b38c7732ba08ce438a6a754e67c26942e95c69a4bb5472d6be3a815351e74b5fc0ea188f2322fc2"

RPROVIDES:${PN} += "ghc-ansi-terminal-types \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
