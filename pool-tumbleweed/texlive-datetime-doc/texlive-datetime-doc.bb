SUMMARY = "Documentation for texlive-datetime"
DESCRIPTION = "This package includes the documentation for texlive-datetime"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.60svn36650"

RPM_NAME = "texlive-datetime-doc-2023.209.2.60svn36650-55.1.noarch.rpm"
RPM_HASH = "114a3b1f0d31befd66b980b528482c858e4f26d57492bda6b8fa370227fb5968989f0e05e0e7bbe87a128c1b458e0ec20db2c1d1402f09b926e33f1c895240e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime-doc"

RDEPENDS:${PN} += ""

inherit rpm
