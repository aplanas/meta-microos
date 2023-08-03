SUMMARY = "Documentation for texlive-scratch3"
DESCRIPTION = "This package includes the documentation for texlive-scratch3"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-doc-2023.209.0.0.19svn61921-54.1.noarch.rpm"
RPM_HASH = "61f3a1b10c295e3351e79c9bd59a14e6d318c8d04771fecf32b258084cf882ab1c43fcffacbe731b6b7bc9e6066c3a187169cf64826a7ce8327c0131c89c80e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-scratch3-doc-fr \
texlive-scratch3-doc"

RDEPENDS:${PN} += ""

inherit rpm
