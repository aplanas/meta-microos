SUMMARY = "Documentation for texlive-askmaps"
DESCRIPTION = "This package includes the documentation for texlive-askmaps"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn56730"

RPM_NAME = "texlive-askmaps-doc-2023.209.0.0.2svn56730-54.1.noarch.rpm"
RPM_HASH = "b398cb934b2047ab03e98ff57d8c9e614cc782170856d462c7d5df36c3556def17b5d45d573ef6a3d7e1f654b4f72f8fa239ee7e7ad72d2a659ac70ad00e0149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
