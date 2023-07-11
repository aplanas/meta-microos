SUMMARY = "Documentation for texlive-xpiano"
DESCRIPTION = "This package includes the documentation for texlive-xpiano"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-xpiano-doc-2023.201.1.0svn61719-52.2.noarch.rpm"
RPM_HASH = "8a9441864a673ce5b695962b555327bf757c2caa63f9d3d0f4d32147b40edec16e3ce0f4ead7616ca4a36f1cab805abe42f04ac76f8ab81709293011dfa582ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpiano-doc"

RDEPENDS:${PN} += ""

inherit rpm
