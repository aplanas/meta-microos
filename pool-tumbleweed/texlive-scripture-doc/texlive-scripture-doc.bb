SUMMARY = "Documentation for texlive-scripture"
DESCRIPTION = "This package includes the documentation for texlive-scripture"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn65493"

RPM_NAME = "texlive-scripture-doc-2023.201.1.3svn65493-53.1.noarch.rpm"
RPM_HASH = "2ce68db46b3de34e5258483debac641c1654bbf6bb5aabf060aaca1d9d78b69b536bdb0453fed0eaf8ec549e17de0e696e6545a562162dcc34a7e3ed14350761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scripture-doc"
RDEPENDS:${PN} += ""

inherit rpm
