SUMMARY = "Documentation for texlive-crosswrd"
DESCRIPTION = "This package includes the documentation for texlive-crosswrd"
LICENSE = "LPPL-1.0"

PV = "2023.204.3.0svn16896"

RPM_NAME = "texlive-crosswrd-doc-2023.204.3.0svn16896-54.1.noarch.rpm"
RPM_HASH = "28894aecfc8541e6de22b6f83d8b0aa9949a72a920aeccabdec6a2bb8df0dbfc90ac34edc2aa7883759a94c261eef51bd292c492c10dbcf2509a6f4fabcc1ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crosswrd-doc"
RDEPENDS:${PN} += ""

inherit rpm
