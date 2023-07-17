SUMMARY = "Haskell ShellCheck library documentation"
DESCRIPTION = "This package provides the Haskell ShellCheck library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "ghc-ShellCheck-doc-0.9.0-2.7.noarch.rpm"
RPM_HASH = "0ae1bd35ce398c318822a67ab996250185c1e520304ac2572f49c4a58afce19a9ea17843337a11b6cb23b9881f66e8a3645269cea1aca783f798caebc964964d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ShellCheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
