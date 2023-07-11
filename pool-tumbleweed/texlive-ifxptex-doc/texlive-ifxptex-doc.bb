SUMMARY = "Documentation for texlive-ifxptex"
DESCRIPTION = "This package includes the documentation for texlive-ifxptex"
LICENSE = "SUSE-TeX"

PV = "2023.208.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-doc-2023.208.0.0.2svn46153-53.1.noarch.rpm"
RPM_HASH = "97c6b8909ed4b768c29fc6c40b8778c9ba15c3cd56f95fce4674186cf7f8478457eb96f1b142d25dae1ccf1e2118b5a328896a039ec950479c5f4b6eb1f82b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifxptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
