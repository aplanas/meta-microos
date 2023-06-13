SUMMARY = "Documentation for texlive-macroswap"
DESCRIPTION = "This package includes the documentation for texlive-macroswap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn31498"

RPM_NAME = "texlive-macroswap-doc-2023.201.1.1svn31498-52.1.noarch.rpm"
RPM_HASH = "998f281aff8082b16d7d292c465912e91765a3804ec2fbe8ea258175507ab628f8f351b6a552960ebca88aaf1944b611e8b4b5c527c6acc1d437dea6a506763a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macroswap-doc"

RDEPENDS:${PN} += ""

inherit rpm
