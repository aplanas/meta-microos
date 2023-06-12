SUMMARY = "Documentation for texlive-xifthen"
DESCRIPTION = "This package includes the documentation for texlive-xifthen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-doc-2023.201.1.4.0svn38929-52.1.noarch.rpm"
RPM_HASH = "88e9a519273ccaeff5732768ea4c071e4d0f0eddebf90c8decb114d26c9dd71595fec2614b044b1375efd94dfee0581fe070389c554307755fefee16ef31f11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xifthen-doc"
RDEPENDS:${PN} += ""

inherit rpm
