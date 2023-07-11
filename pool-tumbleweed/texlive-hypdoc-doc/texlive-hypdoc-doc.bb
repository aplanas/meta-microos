SUMMARY = "Documentation for texlive-hypdoc"
DESCRIPTION = "This package includes the documentation for texlive-hypdoc"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.18svn65678"

RPM_NAME = "texlive-hypdoc-doc-2023.208.1.18svn65678-53.1.noarch.rpm"
RPM_HASH = "df646eb779ed0e8f93d496ade0143227d23c99685e4b5a94aa41d12e935943349f12ac0b2ff7dec44f054398f283ac1633d8728c10cb54084857850e52848661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
