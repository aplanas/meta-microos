SUMMARY = "Documentation for texlive-mathabx-type1"
DESCRIPTION = "This package includes the documentation for texlive-mathabx-type1"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn21129"

RPM_NAME = "texlive-mathabx-type1-doc-2023.208.svn21129-53.1.noarch.rpm"
RPM_HASH = "9cd24a9715c9d3fac8141dda466d4633098bf59a6f0159904725e2bfe4f1501f1408ae79d4e8d543262bd9d2d3a05060cea9992c3bc8d4592e0bcc597d87cf99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathabx-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
