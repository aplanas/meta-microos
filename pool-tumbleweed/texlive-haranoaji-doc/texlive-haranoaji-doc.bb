SUMMARY = "Documentation for texlive-haranoaji"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-doc-2023.209.20230223svn66115-54.2.noarch.rpm"
RPM_HASH = "bc424f8821447859a2ac3ff650769e45b609289b68246ac157c6ca29f3c6b2654cbf428dca2d5655a6400d3c15852951dd16b4715fb5c18089deaede724dd678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-doc"

RDEPENDS:${PN} += ""

inherit rpm
