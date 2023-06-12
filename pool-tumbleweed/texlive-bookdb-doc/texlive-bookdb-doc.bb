SUMMARY = "Documentation for texlive-bookdb"
DESCRIPTION = "This package includes the documentation for texlive-bookdb"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn37536"

RPM_NAME = "texlive-bookdb-doc-2023.201.0.0.2svn37536-52.1.noarch.rpm"
RPM_HASH = "4cb5b73d43c419788eefba2c1023c28936a51bf8f7e60aa4b851c80a03bf96d6a51e3e87ece336b41fd80e28f1f5418b7cbceb36d9502219e26a7e1055e5d00a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb-doc"
RDEPENDS:${PN} += ""

inherit rpm
