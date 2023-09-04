SUMMARY = "The Wadler/Leijen Pretty Printer for colored ANSI terminal output"
DESCRIPTION = "This is a pretty printing library based on Wadler's paper ['A Prettier \
Printer'](https://homepages.inf.ed.ac.uk/wadler/papers/prettier/prettier.pdf). \
It has been enhanced with support for ANSI terminal colored output using the \
[ansi-terminal](https://hackage.haskell.org/package/ansi-terminal) package."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-0.6.9-11.2.aarch64.rpm"
RPM_HASH = "58458c3017b40ede55f74c40405db0754b4379f7ba164ca4209d9b72e7dfbd05967a46d25c22621a82b495edbdc13fb619dae79022ff5dcbd381857d05bcc9a4"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint \
libHSansi-wl-pprint-0.6.9-Akll4C7DaaL4wD8pj4jz8a-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3-ghc9.4.6.so \
libHSansi-terminal-types-0.11.5-1ECcaJ3QBZ1LkDeP7l0nlp-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScolour-2.3.6-GBcey48GJNAK3398XtiZDq-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
