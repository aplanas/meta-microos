SUMMARY = "Documentation for texlive-mahjong"
DESCRIPTION = "This package includes the documentation for texlive-mahjong"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn58896"

RPM_NAME = "texlive-mahjong-doc-2023.201.1.0.1svn58896-52.1.noarch.rpm"
RPM_HASH = "eec86a4ddcfbb05b05983e48218b3f8eb96dd4eacb776ce7ba371678033e5800e2aa6e9f8e10935850e7468d67dae5fb9717708913442c55147e2e57f34c2365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mahjong-doc"
RDEPENDS:${PN} += ""

inherit rpm
