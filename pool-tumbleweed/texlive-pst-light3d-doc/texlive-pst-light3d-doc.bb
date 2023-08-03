SUMMARY = "Documentation for texlive-pst-light3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-light3d"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn15878"

RPM_NAME = "texlive-pst-light3d-doc-2023.209.0.0.12svn15878-53.1.noarch.rpm"
RPM_HASH = "691d472eeb9c206153ff7db73d32dac96ef7f337b16875ed93c197bdd0610c7b85b156f2d6e7ca315dc1e5c65551d829ec878c26df3b9f364786181d9de723a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-light3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
