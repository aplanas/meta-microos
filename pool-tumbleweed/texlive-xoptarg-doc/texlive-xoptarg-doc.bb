SUMMARY = "Documentation for texlive-xoptarg"
DESCRIPTION = "This package includes the documentation for texlive-xoptarg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-xoptarg-doc-2023.201.1.0svn15878-52.2.noarch.rpm"
RPM_HASH = "dc264428589835a77f8aa38df82581998dbf2a162d62f310fb48fd62763e1df42f9a9c306e90f2ed63e66a29ffa0e7e5d8903650796931ed0f290394165acb5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xoptarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
