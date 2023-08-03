SUMMARY = "Documentation for texlive-modes"
DESCRIPTION = "This package includes the documentation for texlive-modes"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.2svn61719"

RPM_NAME = "texlive-modes-doc-2023.209.4.2svn61719-55.1.noarch.rpm"
RPM_HASH = "ff4b19f1b57d7cca2fc0249bd9bb786fa0b8c25c9557065ac0bb25160fd9bffe739dd15d2b10295c240c9635478298ede6ce9fe0085fb18f0e7b7d5e5428e1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modes-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
