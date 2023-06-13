SUMMARY = "Documentation for texlive-random"
DESCRIPTION = "This package includes the documentation for texlive-random"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn54723"

RPM_NAME = "texlive-random-doc-2023.201.0.0.2svn54723-53.1.noarch.rpm"
RPM_HASH = "be590d24fe380b5e3fd167306a7d74c9385c75556bab7300abca1415864c68e8a9fab1c4eb9b13a0615623b512615b38ff145297ebacf703c3cffad85d6889bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-random-doc"

RDEPENDS:${PN} += ""

inherit rpm
