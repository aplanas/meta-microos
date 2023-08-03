SUMMARY = "Documentation for texlive-oberdiek"
DESCRIPTION = "This package includes the documentation for texlive-oberdiek"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65521"

RPM_NAME = "texlive-oberdiek-doc-2023.209.svn65521-55.1.noarch.rpm"
RPM_HASH = "00889b02f2ab953856011d78ce07df17b4cca87426fe103081a7d5abbdc4360f452f516096f7409771281cb2ac7fcb5dcdfe06634c6445b087a082427cd79f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oberdiek-doc"

RDEPENDS:${PN} += ""

inherit rpm
