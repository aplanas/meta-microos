SUMMARY = "Haskell wizards library development files"
DESCRIPTION = "This package provides the Haskell wizards library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "ghc-wizards-devel-1.0.3-5.3.aarch64.rpm"
RPM_HASH = "ca31dd911d99141445a407ecb34711e5da73c7e5dd7b3e69a443a2825fae9797928093d30746f1b5959f67b9fc5cf70d87c413ede391d08fbcc4266b54c01b60"

RPROVIDES:${PN} += "ghc-devel(wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb) \
ghc-wizards-devel \
ghc-wizards-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(control-monad-free-0.6.2-AMlHq80A2qJLNQ8iIcl5z7) \
ghc-devel(haskeline-0.8.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-wizards"

inherit rpm
