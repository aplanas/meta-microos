SUMMARY = "Documentation for texlive-ctanify"
DESCRIPTION = "This package includes the documentation for texlive-ctanify"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.1svn44129"

RPM_NAME = "texlive-ctanify-doc-2023.209.1.9.1svn44129-55.1.noarch.rpm"
RPM_HASH = "a05c476393e78b681460ccad4b0c0af3067927c880a8113f50732c2cc07e1154d65b58d4655897c7b02672770d31f50e2dca19250f5daf39be68dc69d6579abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctanify.1 \
texlive-ctanify-doc"

RDEPENDS:${PN} += ""

inherit rpm
