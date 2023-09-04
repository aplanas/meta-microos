SUMMARY = "Documentation for texlive-qstest"
DESCRIPTION = "This package includes the documentation for texlive-qstest"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qstest-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "71fd852c3e736343efca6ba886f76fcfda617a8c07fa83e807df7d65e0c17e179c1b4e99e64e0a5c29ec02e642d2730e0f099d0c21433ab6d1de7594e5102b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qstest-doc"

RDEPENDS:${PN} += ""

inherit rpm
