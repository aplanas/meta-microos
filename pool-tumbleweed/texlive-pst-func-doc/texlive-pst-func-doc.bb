SUMMARY = "Documentation for texlive-pst-func"
DESCRIPTION = "This package includes the documentation for texlive-pst-func"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.99svn60933"

RPM_NAME = "texlive-pst-func-doc-2023.201.0.0.99svn60933-52.1.noarch.rpm"
RPM_HASH = "c2f69cb4eb2220f748de2c085db919a39efbb3416d38ae2b7909adeb957793e029ca8c1132d18dc021dc1b1c6bc6927bb8550b023a0b4df4a80f3b5820795ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-func-doc"

RDEPENDS:${PN} += ""

inherit rpm
