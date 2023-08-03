SUMMARY = "Documentation for texlive-latex-tools-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-tools-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-tools-dev-doc-2023.209.20230501_pre_release_0svn64899-56.1.noarch.rpm"
RPM_HASH = "d9828c0d94db6dc232d9fb1d4d749f168c1b491aa3809e55fb5f87b824d1a631ea143e38a5db2fb573ea3220f41f9b9642f0c99b956e26fd2d51654f4d0a80d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-tools-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
