SUMMARY = "Documentation for texlive-grabbox"
DESCRIPTION = "This package includes the documentation for texlive-grabbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65223"

RPM_NAME = "texlive-grabbox-doc-2023.201.1.4svn65223-53.2.noarch.rpm"
RPM_HASH = "45770ece354544c92dadc2be6ec1b6df9ac3656c33e825cd1ce758bc46d78352e705676d5a4cabdc44442b31f88f606c660e39f56a156c563202aa37081394c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grabbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
