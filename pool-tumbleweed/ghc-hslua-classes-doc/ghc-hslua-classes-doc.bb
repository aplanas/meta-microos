SUMMARY = "Haskell hslua-classes library documentation"
DESCRIPTION = "This package provides the Haskell hslua-classes library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-classes-doc-2.3.0-1.6.noarch.rpm"
RPM_HASH = "33fca82bf72e23259004f9aa0efd5e05b0e19da1006bfd37f2952af442db3472a7aef518ad68057c633775e40580e242fdb67401c97dc45406b5dc44219a5bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-classes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
