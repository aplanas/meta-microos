SUMMARY = "Haskell filepattern library development files"
DESCRIPTION = "This package provides the Haskell filepattern library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-devel-0.1.3-2.8.aarch64.rpm"
RPM_HASH = "687c9347e8485351b15141c4576cdd538142344159cef03f47ff063bbb23b366b8b350571f73cc73b973ecc9007cc77f7f6424f637bbe1a33c4bee5f738e1d55"

RPROVIDES:${PN} += "ghc-devel-filepattern-0.1.3-ZuemUYkhwGA1RPuLxzdA9 \
ghc-filepattern-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-devel-filepath-1.4.2.2 \
ghc-filepattern"

inherit rpm
