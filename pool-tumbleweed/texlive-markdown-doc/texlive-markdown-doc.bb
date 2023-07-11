SUMMARY = "Documentation for texlive-markdown"
DESCRIPTION = "This package includes the documentation for texlive-markdown"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.21.0_0_gee15b88svn66257"

RPM_NAME = "texlive-markdown-doc-2023.208.2.21.0_0_gee15b88svn66257-53.1.noarch.rpm"
RPM_HASH = "88f2c76d513fc7919ed3c6c99644b4ebe5fe239032a90d0fb7bf69c0eadcdf9206f05e80c05fd1d116f662af7f0128daef0ba0904aa72bb76188d7c992ae85a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-markdown-doc"

RDEPENDS:${PN} += ""

inherit rpm
