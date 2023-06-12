SUMMARY = "Documentation for texlive-kotex-utils"
DESCRIPTION = "This package includes the documentation for texlive-kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn38727"

RPM_NAME = "texlive-kotex-utils-doc-2023.201.2.1.0svn38727-55.1.noarch.rpm"
RPM_HASH = "a0b4f4deb8af82ded9a732c3eae8e5f1bdffddd6862824c66ebdf8e4f9694986be016669ccad556b8d6f382245d5c4d9a7b71cd96527519f639bc639853aef12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kotex-utils-doc"
RDEPENDS:${PN} += ""

inherit rpm
