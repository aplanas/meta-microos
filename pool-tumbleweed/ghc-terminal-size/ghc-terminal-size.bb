SUMMARY = "Get terminal window height and width"
DESCRIPTION = "Get terminal window height and width without ncurses dependency."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-0.3.4-1.4.aarch64.rpm"
RPM_HASH = "20997f636413b6470eeee83bccaa4c7c6c91ad94f549ffc50018abb2213714835b61354c3faf69a3ba00defbe629ed2bbbf5132cb7dda13a229611839c0004ee"

RPROVIDES:${PN} += "ghc-terminal-size \
libHSterminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
