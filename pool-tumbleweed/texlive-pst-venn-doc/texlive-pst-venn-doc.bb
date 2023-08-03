SUMMARY = "Documentation for texlive-pst-venn"
DESCRIPTION = "This package includes the documentation for texlive-pst-venn"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-doc-2023.209.0.0.01svn49316-54.1.noarch.rpm"
RPM_HASH = "1064bcddaf813bfdfcbbf2a8c6a53c7cc5428268ca645f6bb1aaa72e00d7ac12bdd3376ccce39d71a5c0c83ca0e4303387f558379fb32a06aa8c8f1d890818bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
