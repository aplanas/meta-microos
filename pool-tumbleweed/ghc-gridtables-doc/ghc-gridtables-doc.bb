SUMMARY = "Haskell gridtables library documentation"
DESCRIPTION = "This package provides the Haskell gridtables library documentation."
LICENSE = "MIT"

PV = "0.1.0.0"

RPM_NAME = "ghc-gridtables-doc-0.1.0.0-1.4.noarch.rpm"
RPM_HASH = "a3359bbe0ec53e85a67bf18236162ae8b87f4b815ead509e47a48e02b8e0c23048846342d3c1fbaeebfce6fe679aa14513248f9e2eea872f919cf78f901323b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gridtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
