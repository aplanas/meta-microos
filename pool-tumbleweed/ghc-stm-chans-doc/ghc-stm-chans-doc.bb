SUMMARY = "Haskell stm-chans library documentation"
DESCRIPTION = "This package provides the Haskell stm-chans library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-doc-3.0.0.9-1.3.noarch.rpm"
RPM_HASH = "df2717d7a569982449aea70c54088dc9c30e05f689e80de145fc7993cffc94bf505adc7017ef2331b2d84fd22f1e91228d9c59cebb6784c2688f7cfd4f320240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-chans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
