SUMMARY = "Documentation for texlive-pst-geo"
DESCRIPTION = "This package includes the documentation for texlive-pst-geo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.07svn60387"

RPM_NAME = "texlive-pst-geo-doc-2023.201.0.0.07svn60387-52.1.noarch.rpm"
RPM_HASH = "9ade5d45a669bf6b1e0bb303ed12a23043ebcae4874fd488038530fb928dc897964ae0c6b52d9fb7f6a24b63922df465eb3da734c9c71151a138a698b6ae357f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-geo-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
