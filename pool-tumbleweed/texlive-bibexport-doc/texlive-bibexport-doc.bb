SUMMARY = "Documentation for texlive-bibexport"
DESCRIPTION = "This package includes the documentation for texlive-bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn50677"

RPM_NAME = "texlive-bibexport-doc-2023.201.3.03svn50677-53.1.noarch.rpm"
RPM_HASH = "61f8061dbcef6ceac87e9349c409245d3b4ef213db3b18db1cd779194e99246edb10d37a0cdc31a5722054f0ba268cb56633be70dd185902d6deaab9d5139897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibexport-doc"

RDEPENDS:${PN} += ""

inherit rpm
