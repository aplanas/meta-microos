SUMMARY = "Documentation for texlive-fcolumn"
DESCRIPTION = "This package includes the documentation for texlive-fcolumn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn61855"

RPM_NAME = "texlive-fcolumn-doc-2023.201.1.4.1svn61855-52.1.noarch.rpm"
RPM_HASH = "d3f2f048c34721775e64e85b5f18871ea08297014f6bd573baa76e2be78bf3bb25eec6f8e54ce102181b925e6a672d2a26d4c46a3a1cacbc8cb0d186fcd710b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcolumn-doc"

RDEPENDS:${PN} += ""

inherit rpm
