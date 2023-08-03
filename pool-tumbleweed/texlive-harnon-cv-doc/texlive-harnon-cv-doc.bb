SUMMARY = "Documentation for texlive-harnon-cv"
DESCRIPTION = "This package includes the documentation for texlive-harnon-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn26543"

RPM_NAME = "texlive-harnon-cv-doc-2023.209.1.0svn26543-54.1.noarch.rpm"
RPM_HASH = "c21da9a16d35fdf64222923b7f5201ff65ae7f3434357f4789369a796c4ebf526f49a760da4fc1ccc5e20215d8887f93ff443109ceca82189d68377b46582e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harnon-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
