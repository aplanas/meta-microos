SUMMARY = "Documentation for texlive-beamertheme-simpleplus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpleplus"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn64770"

RPM_NAME = "texlive-beamertheme-simpleplus-doc-2023.201.1.0svn64770-53.1.noarch.rpm"
RPM_HASH = "18e6de409a1b7858292b4c2776edb1287fe92bf72c9172457116257f2e519abb5fa4ee1ec55eda1f4dfe03e835df38d595254482a8f12d4102f823456fe5d305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpleplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
