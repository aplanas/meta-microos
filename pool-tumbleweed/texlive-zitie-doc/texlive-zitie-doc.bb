SUMMARY = "Documentation for texlive-zitie"
DESCRIPTION = "This package includes the documentation for texlive-zitie"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn60676"

RPM_NAME = "texlive-zitie-doc-2023.209.1.4.0svn60676-53.2.noarch.rpm"
RPM_HASH = "0abc850aaf1fe7e224118709bb3fe59353205921f05f37d61f1cd23c3609b62ae4db6d5a8d184a3c5015c6bd126e08f22ccc42de158adc5f01df78cf79ef7c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zitie-doc-zh \
texlive-zitie-doc"

RDEPENDS:${PN} += ""

inherit rpm
