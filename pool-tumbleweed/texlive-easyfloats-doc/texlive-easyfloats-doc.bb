SUMMARY = "Documentation for texlive-easyfloats"
DESCRIPTION = "This package includes the documentation for texlive-easyfloats"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn57204"

RPM_NAME = "texlive-easyfloats-doc-2023.201.1.0.0svn57204-53.1.noarch.rpm"
RPM_HASH = "63ec271fb306298d7ad8cde89c2c7fe6a2ecea84988c2798015aa62cb3d739ade9f148265b97835e79d72dba43c07dfb955037ad330f0da576cc98c51d5a20bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easyfloats-doc"

RDEPENDS:${PN} += "/usr/bin/python"

inherit rpm
