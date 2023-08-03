SUMMARY = "Documentation for texlive-xfor"
DESCRIPTION = "This package includes the documentation for texlive-xfor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn15878"

RPM_NAME = "texlive-xfor-doc-2023.209.1.05svn15878-53.1.noarch.rpm"
RPM_HASH = "88d68b182c0b6977956fbcef80bf5790c3fdf53a87995cb8a90ecb035d362f50a0af6b05ec8725ce01781b5c8bf99a84d8c21c5883f37e5041dd6ea31f4b1f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xfor-doc"

RDEPENDS:${PN} += ""

inherit rpm
