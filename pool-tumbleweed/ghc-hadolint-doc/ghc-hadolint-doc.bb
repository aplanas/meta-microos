SUMMARY = "Haskell hadolint library documentation"
DESCRIPTION = "This package provides the Haskell hadolint library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-doc-2.12.0-1.8.noarch.rpm"
RPM_HASH = "88c681ca7406bb4b5ddf5ab115838a848c1d5e398f99b3533449d068528fc1194327041fe425cde19d958de3da5f322cd68393c836923f2f6820be2b478b0328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hadolint-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
