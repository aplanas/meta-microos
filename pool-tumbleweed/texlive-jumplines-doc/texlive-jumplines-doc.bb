SUMMARY = "Documentation for texlive-jumplines"
DESCRIPTION = "This package includes the documentation for texlive-jumplines"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-doc-2023.201.0.0.2svn37553-55.1.noarch.rpm"
RPM_HASH = "879c5991cf1280b600bc69b0f264d201669883bfc2e136d2580e8d95548e579e0cf4b2194aca4a8c537991ddada51e360aaa2ceb734a52ff9f92ad0d06c6f01a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jumplines-doc"

RDEPENDS:${PN} += ""

inherit rpm
