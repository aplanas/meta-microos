SUMMARY = "Documentation for texlive-pst-venn"
DESCRIPTION = "This package includes the documentation for texlive-pst-venn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-doc-2023.201.0.0.01svn49316-53.1.noarch.rpm"
RPM_HASH = "025f6cbc6648dd9b1bc2112919082e3e70d16f89ffb3db7e901fa6241fdecc7a7c5c25711488efffdfce1a9b62d55926a2f06b2c6767f84dcffca130aa83378e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-venn-doc"
RDEPENDS:${PN} += ""

inherit rpm
