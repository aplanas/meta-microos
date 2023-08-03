SUMMARY = "Documentation for texlive-epsincl"
DESCRIPTION = "This package includes the documentation for texlive-epsincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.2svn29349"

RPM_NAME = "texlive-epsincl-doc-2023.209.0.0.2svn29349-54.1.noarch.rpm"
RPM_HASH = "dee42be394b54219f6298231d7009e88590edf9cf641356bc81f6803eb047dc2345d0ec98cde95151a0916475816f127276bb7026d882c60a9ce55d4017de42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
