SUMMARY = "Documentation for texlive-gindex"
DESCRIPTION = "This package includes the documentation for texlive-gindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52311"

RPM_NAME = "texlive-gindex-doc-2023.201.0.0.2svn52311-52.1.noarch.rpm"
RPM_HASH = "f19a6d8c7c53b4f1f281cb19eeeb416949be7372ee5289a560146ed2eb92b07ac9f99b7af93c5848622d2d0d2cd4907109e27daf95551787a2b989e88e12db8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
