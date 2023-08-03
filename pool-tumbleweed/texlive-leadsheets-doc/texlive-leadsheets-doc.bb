SUMMARY = "Documentation for texlive-leadsheets"
DESCRIPTION = "This package includes the documentation for texlive-leadsheets"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-doc-2023.209.0.0.7svn61504-55.1.noarch.rpm"
RPM_HASH = "c3cf633d66ea2d42f06fae96b9399c5c88f08a2bda985313b0da3405d42cd7399cbb0271689f9a6445fc3dc21b2c3f5149b20492d1bbe645e03c77de6d15e276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leadsheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
