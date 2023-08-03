SUMMARY = "Documentation for texlive-blopentype"
DESCRIPTION = "This package includes the documentation for texlive-blopentype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn65441"

RPM_NAME = "texlive-blopentype-doc-2023.209.0.0.0.0svn65441-53.1.noarch.rpm"
RPM_HASH = "a3fd9243a1a62d7d049c50ed61860a741ac3e8e5fe9ba889b14e98fd4e58d38987c0506ff474809618fe4b2c7ea75bed54bd7285ae53bb72f13888a7e66b84c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blopentype-doc"

RDEPENDS:${PN} += ""

inherit rpm
