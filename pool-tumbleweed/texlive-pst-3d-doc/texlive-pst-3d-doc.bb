SUMMARY = "Documentation for texlive-pst-3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn17257"

RPM_NAME = "texlive-pst-3d-doc-2023.201.1.10svn17257-52.1.noarch.rpm"
RPM_HASH = "59901dd8783cd78ad266c075678f88a7efdb2c9e26d4d210d985b9511fa16943aecb5ba0d885f0587cc27cf0c25013b29ebf2a24b19ed430e45223aa41e20b1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3d-doc"
RDEPENDS:${PN} += ""

inherit rpm
