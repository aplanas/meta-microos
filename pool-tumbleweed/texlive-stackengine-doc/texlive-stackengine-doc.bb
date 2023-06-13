SUMMARY = "Documentation for texlive-stackengine"
DESCRIPTION = "This package includes the documentation for texlive-stackengine"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.11svn60019"

RPM_NAME = "texlive-stackengine-doc-2023.201.4.11svn60019-57.1.noarch.rpm"
RPM_HASH = "2b87683bcb9851fe646e8c8d57bdecbcb571d2e4022c503c2f5fe804c4216ba0259051a1f17b41594b5deaa66d659a1aff4075d36b654ca34abdf0b99483a9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stackengine-doc"

RDEPENDS:${PN} += ""

inherit rpm
