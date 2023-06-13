SUMMARY = "Documentation for texlive-gammas"
DESCRIPTION = "This package includes the documentation for texlive-gammas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56403"

RPM_NAME = "texlive-gammas-doc-2023.201.1.1svn56403-52.1.noarch.rpm"
RPM_HASH = "37aaff5211a7e9e6388c8dc10d4da58701486d67518c715cadb8eb6e32686d81b12f7e59d5eb4774359331818f81410e71853f4185372f9e335e6e6e5d1d3ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gammas-doc"

RDEPENDS:${PN} += ""

inherit rpm
