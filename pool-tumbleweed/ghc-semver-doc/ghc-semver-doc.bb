SUMMARY = "Haskell semver library documentation"
DESCRIPTION = "This package provides the Haskell semver library documentation."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-semver-doc-0.4.0.1-1.6.noarch.rpm"
RPM_HASH = "9ebaafb8d4146bd764a2f2522c2fbe0897fa5dd1398b93a3ad344aa5f34e5372111e181fefa6be527924a4d2a9eacfe7353bb8887f869768e7aa4dd0dfd4c49c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
