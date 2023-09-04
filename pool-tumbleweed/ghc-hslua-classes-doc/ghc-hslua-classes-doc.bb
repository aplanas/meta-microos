SUMMARY = "Haskell hslua-classes library documentation"
DESCRIPTION = "This package provides the Haskell hslua-classes library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-doc-2.3.0-1.8.noarch.rpm"
RPM_HASH = "c771d17c2c2e0809e0f913e4b86033594d10a6cab611624d6b079886dd939f400154e2d057bc06210c40ca90d204e79cede420c07b8cdbffacb12ebada35631d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-classes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
