SUMMARY = "Documentation for texlive-frankenstein"
DESCRIPTION = "This package includes the documentation for texlive-frankenstein"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-frankenstein-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "031bce8378e787c2f3c2e5c624585bccc574400195f8ad3322004b8dd2f683ed79ccc6b34be9ebc43c3ba3d6b17ead7f03536f4b454f835b57903d1a45c6ea19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frankenstein-doc"
RDEPENDS:${PN} += ""

inherit rpm
