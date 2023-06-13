SUMMARY = "Documentation for texlive-export"
DESCRIPTION = "This package includes the documentation for texlive-export"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn27206"

RPM_NAME = "texlive-export-doc-2023.201.1.8svn27206-52.1.noarch.rpm"
RPM_HASH = "08bdbba0a5a6a6579d7261800fcd2bcac3485b36ac8deb0c2468cda303ad7dd744c00b6e123dbaf4f97665388cebe4380a2e5eca7ac200cfef7d3ce739ab9be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-export-doc"

RDEPENDS:${PN} += ""

inherit rpm
