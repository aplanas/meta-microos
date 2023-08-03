SUMMARY = "Documentation for texlive-color-edits"
DESCRIPTION = "This package includes the documentation for texlive-color-edits"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56707"

RPM_NAME = "texlive-color-edits-doc-2023.209.1.1svn56707-54.1.noarch.rpm"
RPM_HASH = "a00d53232817aa33a603a296ae51b564e44779528663a045e735bf7920aff621f545a90f1c54d592c0b7f537fb79f9a7f639ffca3f07e0fe933deca03aaa8850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-color-edits-doc"

RDEPENDS:${PN} += ""

inherit rpm
