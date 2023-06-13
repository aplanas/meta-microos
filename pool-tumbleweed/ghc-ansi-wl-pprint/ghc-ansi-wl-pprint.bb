SUMMARY = "The Wadler/Leijen Pretty Printer for colored ANSI terminal output"
DESCRIPTION = "This is a pretty printing library based on Wadler's paper ['A Prettier \
Printer'](https://homepages.inf.ed.ac.uk/wadler/papers/prettier/prettier.pdf). \
It has been enhanced with support for ANSI terminal colored output using the \
[ansi-terminal](https://hackage.haskell.org/package/ansi-terminal) package."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-0.6.9-10.2.aarch64.rpm"
RPM_HASH = "51f4c864babf7b937efbf26c5733dac7fd327ca517c77522c9e5ce5d927e63d529f27b974be17c86bcb83d76639fa47e92c70ba0d24f6954119c8fcb2c9957fe"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint \
ghc-ansi-wl-pprint(aarch-64) \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
