SUMMARY = "Documentation for texlive-savefnmark"
DESCRIPTION = "This package includes the documentation for texlive-savefnmark"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-savefnmark-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "5412ac8fb07dfdf16d9dd1633ee016e07dc8587836beafdafce0800193dcb5c81cf2b3c7eebf31fc84906dc3a380220e7a270d24b6bd99f3128685be3d05a930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-savefnmark-doc"

RDEPENDS:${PN} += ""

inherit rpm
