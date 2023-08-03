SUMMARY = "Documentation for texlive-texments"
DESCRIPTION = "This package includes the documentation for texlive-texments"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-doc-2023.209.0.0.2.0svn15878-55.1.noarch.rpm"
RPM_HASH = "220bbd5f90c0a5cb7ab5701117c8a10193c7e590f4b20a0fca375b1f21029b83410e69fedb3d0c142ef3de03d7bddc64388be11f63beecbab89664b963fbb0e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texments-doc"

RDEPENDS:${PN} += ""

inherit rpm
