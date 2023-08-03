SUMMARY = "Documentation for texlive-evangelion-jfm"
DESCRIPTION = "This package includes the documentation for texlive-evangelion-jfm"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0_bsvn65824"

RPM_NAME = "texlive-evangelion-jfm-doc-2023.209.1.0.0_bsvn65824-53.1.noarch.rpm"
RPM_HASH = "fa3801067a628e09672bec88493723e1aae8a68d9a56d0368f6850bea788f151bf2074e9d4b787b2377f28d14a98ad3d79ae16091a99809387e8c2db5400ff49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-evangelion-jfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
