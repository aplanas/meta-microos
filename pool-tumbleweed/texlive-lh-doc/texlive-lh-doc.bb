SUMMARY = "Documentation for texlive-lh"
DESCRIPTION = "This package includes the documentation for texlive-lh"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.5gsvn15878"

RPM_NAME = "texlive-lh-doc-2023.209.3.5gsvn15878-55.1.noarch.rpm"
RPM_HASH = "83e130366b08946ec27f1f5c886bc4406fcb5f1fa3746172bdffbcc3a5f21d5653ac48f708e0c523c14aefd4af7367479c31defe59fa53be1c067c3dde24f2fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lh-doc"

RDEPENDS:${PN} += ""

inherit rpm
