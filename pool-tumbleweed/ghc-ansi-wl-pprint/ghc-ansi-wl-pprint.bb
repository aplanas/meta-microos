SUMMARY = "The Wadler/Leijen Pretty Printer for colored ANSI terminal output"
DESCRIPTION = "This is a pretty printing library based on Wadler's paper ['A Prettier \
Printer'](https://homepages.inf.ed.ac.uk/wadler/papers/prettier/prettier.pdf). \
It has been enhanced with support for ANSI terminal colored output using the \
[ansi-terminal](https://hackage.haskell.org/package/ansi-terminal) package."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-0.6.9-11.1.aarch64.rpm"
RPM_HASH = "b06992d871e1a014a107252becfe6174bce0e9f11cd36197781fcd5d6fc73378c1efa0ef34a1b22b99c3f5a961b93ffd9b51d5d2a863d3dba6e08c3f68aed7f1"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
