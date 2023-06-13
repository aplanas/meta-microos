SUMMARY = "Documentation for texlive-rojud"
DESCRIPTION = "This package includes the documentation for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn56895"

RPM_NAME = "texlive-rojud-doc-2023.201.1.2svn56895-53.1.noarch.rpm"
RPM_HASH = "016185c0ab5a6953e86afbd1f9b45e7c92f65f28504c3507de6f00ac3c8705bbf6ee30505a3241d69dfd9e5b1638ff27b0ce26794d30b5fa59bdeb37ad1e7285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rojud-doc"

RDEPENDS:${PN} += ""

inherit rpm
