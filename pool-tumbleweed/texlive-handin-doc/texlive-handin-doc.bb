SUMMARY = "Documentation for texlive-handin"
DESCRIPTION = "This package includes the documentation for texlive-handin"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-doc-2023.209.0.0.1.1svn48255-54.2.noarch.rpm"
RPM_HASH = "5235e5506731581d8c7ace84327e571e8c73c558320e303037f80e015757a595b97b82a3837e888c7fd5f820181f712d95725d20553438ea04604838062aae2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handin-doc"

RDEPENDS:${PN} += ""

inherit rpm
