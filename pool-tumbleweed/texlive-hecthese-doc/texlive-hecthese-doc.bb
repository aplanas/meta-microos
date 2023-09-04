SUMMARY = "Documentation for texlive-hecthese"
DESCRIPTION = "This package includes the documentation for texlive-hecthese"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn60455"

RPM_NAME = "texlive-hecthese-doc-2023.209.1.5svn60455-54.2.noarch.rpm"
RPM_HASH = "cf65097b2052260f54faeb0624fee159064be9d5c517b0c7d34f35c58d831fa2386bc0133e48d31ac453acf429a398ffa7039df4e34d686743fd5bff29770f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hecthese-doc-en;fr \
texlive-hecthese-doc"

RDEPENDS:${PN} += ""

inherit rpm
