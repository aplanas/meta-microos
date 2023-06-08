SUMMARY = "Types and functions used to represent SGR aspects"
DESCRIPTION = "The 'ANSI' standards refer to the visual style of displaying characters as \
their 'graphic rendition'. The 'ANSI' codes to establish the graphic rendition \
for subsequent text are referred to as SELECT GRAPHIC RENDITION (SGR). \
This package exposes modules that export types and functions used to represent \
SGR aspects."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-0.11.5-1.2.aarch64.rpm"
RPM_HASH = "8dc6d85a3a736869a045ba72a949824ccf2ac80736cf8f44e10fca2ad33ab03382454d9e5751917965aef423335dc6d01ee07150d7a1f1586ecda12705654948"

RPROVIDES:${PN} += "ghc-ansi-terminal-types ghc-ansi-terminal-types(aarch-64) libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
