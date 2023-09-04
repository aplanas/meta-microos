SUMMARY = "Microlens support for Reader/Writer/State from mtl"
DESCRIPTION = "This package contains functions (like 'view' or '+=') which work on \
'MonadReader', 'MonadWriter', and 'MonadState' from the mtl package. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme <https://github.com/monadfix/microlens#readme \
on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-0.2.0.3-2.3.aarch64.rpm"
RPM_HASH = "e4f1be1778dd96826da9dd214b8eb292d02414103dce34ad700d6079821a912856a85d7c4a094f22db908daf9b876f28cdd54e812c14ff66e1696d42b825a852"

RPROVIDES:${PN} += "ghc-microlens-mtl \
libHSmicrolens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSmicrolens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
