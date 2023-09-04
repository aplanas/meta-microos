SUMMARY = "Haskell microlens-platform library documentation"
DESCRIPTION = "This package provides the Haskell microlens-platform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-doc-0.4.3.3-2.6.noarch.rpm"
RPM_HASH = "9327ebc3061c7bb2519442a94ba05400081ac6852f6675aab278d8fc5c9cbe156b5e3c427aeb30ef7a919b157852214f3d1a394ae6af65cdda6bdecbc7b247e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-platform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
