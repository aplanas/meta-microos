SUMMARY = "Documentation for texlive-xdvi"
DESCRIPTION = "This package includes the documentation for texlive-xdvi"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62387"

RPM_NAME = "texlive-xdvi-doc-2023.209.svn62387-53.1.noarch.rpm"
RPM_HASH = "cec02d7cfc9574d6a74f836a52ebea5a739f9fa9e62099644745dd42214df6c1787fc6b79ae1b3f5a44f5630c71f0ae58d3d8c1b9d012dbc828420728d174304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xdvi.1 \
texlive-xdvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
