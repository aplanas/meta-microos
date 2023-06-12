SUMMARY = "Documentation for texlive-emoji"
DESCRIPTION = "This package includes the documentation for texlive-emoji"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.2svn59961"

RPM_NAME = "texlive-emoji-doc-2023.201.0.0.2.2svn59961-53.1.noarch.rpm"
RPM_HASH = "3a057abf88e274e4cef4d857e0b0801a764b07c5796d3e51b052a4db4b285f16073ba92f2c50ff79a20760a87b707dfb0ba9dab77f308910a987209a3a497d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emoji-doc"
RDEPENDS:${PN} += ""

inherit rpm
