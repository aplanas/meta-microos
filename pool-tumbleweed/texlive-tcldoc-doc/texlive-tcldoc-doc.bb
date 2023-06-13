SUMMARY = "Documentation for texlive-tcldoc"
DESCRIPTION = "This package includes the documentation for texlive-tcldoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.40svn22018"

RPM_NAME = "texlive-tcldoc-doc-2023.201.2.40svn22018-54.1.noarch.rpm"
RPM_HASH = "80cdd2de982156bcef2d156fc1cdca0c2eb6e7084191e96e45bab9fdc0497ebcb14b86c5bd867d3e3f7cab9af0c73eace6af5d249f7bf5b9c59bb831f6a78b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tcldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
