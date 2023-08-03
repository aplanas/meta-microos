SUMMARY = "Documentation for texlive-pst-contourplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-contourplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-doc-2023.209.0.0.6svn48230-53.1.noarch.rpm"
RPM_HASH = "47e682c339f5a3e72659660511ebc5ebf598a32d1869097dd1c211e830845d51ad47cd39d4539674882ad7b434552a15384f27def23356b17eca85ba47724d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-contourplot-doc-fr \
texlive-pst-contourplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
