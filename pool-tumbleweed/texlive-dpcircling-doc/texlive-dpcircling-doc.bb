SUMMARY = "Documentation for texlive-dpcircling"
DESCRIPTION = "This package includes the documentation for texlive-dpcircling"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54994"

RPM_NAME = "texlive-dpcircling-doc-2023.201.1.0svn54994-52.1.noarch.rpm"
RPM_HASH = "0d04469c9c1bfd8d48a3d9eb6c7d872496ec4c31f70941fc4d7fa951db53a28f51b639282bfd5ce191377f84a2e106cfac5dab4727e91850cd40d5088b97f229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpcircling-doc"

RDEPENDS:${PN} += ""

inherit rpm
