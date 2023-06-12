SUMMARY = "Documentation for texlive-blochsphere"
DESCRIPTION = "This package includes the documentation for texlive-blochsphere"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38388"

RPM_NAME = "texlive-blochsphere-doc-2023.201.1.1svn38388-52.1.noarch.rpm"
RPM_HASH = "a80106cebcdbf6cac5af491070dbb80af5fa5470dca0b08a5f23e01a9ffafece61643a8445a0db391a4f5ce41bd893d792927ae8696a0f39efab3f9f9363b7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-blochsphere-doc"
RDEPENDS:${PN} += ""

inherit rpm
