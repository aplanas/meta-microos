SUMMARY = "Documentation for texlive-datetime2-magyar"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-magyar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-doc-2023.209.1.1svn48266-53.1.noarch.rpm"
RPM_HASH = "4715ef5b2a20a6a8ba0c5eb5a148183970e416ef01ed83c32928e3c317aa1f7002d37ccadd17f76b8177c6967fe6b0c7580208162e4cce506efcf11760045fb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
