SUMMARY = "Documentation for texlive-luabidi"
DESCRIPTION = "This package includes the documentation for texlive-luabidi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn54512"

RPM_NAME = "texlive-luabidi-doc-2023.201.0.0.5svn54512-52.1.noarch.rpm"
RPM_HASH = "ba277562aed5f5d0c95159ca1096b05ff41cf2da88cbb398ebc07b0aa0fbd6f60a7b094c1a37c354b8829c89355c33e633ed4a2e3369b6a27a30462ee52fdaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luabidi-doc"
RDEPENDS:${PN} += ""

inherit rpm
