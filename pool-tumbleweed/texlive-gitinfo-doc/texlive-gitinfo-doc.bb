SUMMARY = "Documentation for texlive-gitinfo"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn34049"

RPM_NAME = "texlive-gitinfo-doc-2023.201.1.0svn34049-53.2.noarch.rpm"
RPM_HASH = "87931d10609013b86f4400d95c07fb410f1f442c8e1ee570fa6d4a3aec28e78b667c652ded7874907cefff348a5fbfdfe555b0613b1b55a9e0a2f89902e9ad80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
