SUMMARY = "Documentation for texlive-cooking-units"
DESCRIPTION = "This package includes the documentation for texlive-cooking-units"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.00svn65241"

RPM_NAME = "texlive-cooking-units-doc-2023.209.3.00svn65241-55.1.noarch.rpm"
RPM_HASH = "59863ca8c89682f6de11edd48e76fd667683113e0c301cbb9cc1b260e3b29eb2bfdfdf7b9e08a316b55bcb1634365b84c9a7d436fc3eefc845f2b11deb3fb53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
