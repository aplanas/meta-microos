SUMMARY = "Documentation for texlive-graphbox"
DESCRIPTION = "This package includes the documentation for texlive-graphbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46360"

RPM_NAME = "texlive-graphbox-doc-2023.209.1.1svn46360-54.2.noarch.rpm"
RPM_HASH = "8095ad03ac3fd6d8903042bd74d6b6ee2b0d6297869eac92fc5a9b357939ab657c92b6ea992f5d09b469459d62871d5b8875b4c7330ef896fef16e75eae68551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
