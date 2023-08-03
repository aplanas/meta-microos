SUMMARY = "Documentation for texlive-zwgetfdate"
DESCRIPTION = "This package includes the documentation for texlive-zwgetfdate"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-zwgetfdate-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "d2154f6df29adb5d8b7365990f437f2720091531aa1492d3dbda7188d1fe0aed0a53a0ab40ab6e63263e23eb82c011bc68df67d705f525bed587afe4e2f2e8b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwgetfdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
