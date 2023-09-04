SUMMARY = "Documentation for texlive-elsarticle"
DESCRIPTION = "This package includes the documentation for texlive-elsarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3svn56999"

RPM_NAME = "texlive-elsarticle-doc-2023.209.3.3svn56999-54.2.noarch.rpm"
RPM_HASH = "1c5151f7ac6bc1299814391db7540d314616d00e947b7ca87d0f07de3c7df78549a153424b396ed91a0639ff95a084a33f01cb7beedbee69469e50e386eb7aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elsarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
