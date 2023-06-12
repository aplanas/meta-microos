SUMMARY = "Documentation for texlive-rtkinenc"
DESCRIPTION = "This package includes the documentation for texlive-rtkinenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20003"

RPM_NAME = "texlive-rtkinenc-doc-2023.201.1.0svn20003-53.1.noarch.rpm"
RPM_HASH = "ae541b3e19c0644131ec00a4a46ddd94835e6c7aac16884bfe7af074a28c421814d14b6d750ac4dc3d6bdd55059bb17e2c78066cac910b4e05b1a95fcf1d03d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rtkinenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
