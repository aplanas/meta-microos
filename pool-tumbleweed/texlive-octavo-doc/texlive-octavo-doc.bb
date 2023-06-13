SUMMARY = "Documentation for texlive-octavo"
DESCRIPTION = "This package includes the documentation for texlive-octavo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-octavo-doc-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "6e7194f54b45f4bc423726744b895f9921f12c916365e2b4ce6d6245fe25dace8db408db4b8540dbf628f1297f630352a88b074f877a604ac0840b89320bd83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-octavo-doc"

RDEPENDS:${PN} += ""

inherit rpm
