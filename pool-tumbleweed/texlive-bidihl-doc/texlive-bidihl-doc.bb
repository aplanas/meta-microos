SUMMARY = "Documentation for texlive-bidihl"
DESCRIPTION = "This package includes the documentation for texlive-bidihl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn37795"

RPM_NAME = "texlive-bidihl-doc-2023.209.0.0.1csvn37795-54.1.noarch.rpm"
RPM_HASH = "2581c300a14263fb43d1631789cd181e64f5e87489e188438fca90913d6aa68dbfa6d21ee69674830bb3f0bef9cd0f80530f541ae6aa3d311a91695b19bb1627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidihl-doc"

RDEPENDS:${PN} += ""

inherit rpm
