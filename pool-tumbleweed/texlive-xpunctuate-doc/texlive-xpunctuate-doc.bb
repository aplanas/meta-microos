SUMMARY = "Documentation for texlive-xpunctuate"
DESCRIPTION = "This package includes the documentation for texlive-xpunctuate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-doc-2023.201.1.0svn26641-52.1.noarch.rpm"
RPM_HASH = "fcd7166d9c2eba4a6cfbea5f27b4ea2c97762ee743ca1cea492057aa3ed99fa1cdc69c3a82123e944ce07c0ea3e81507f57e5bd6fed3321a8308824cc440f7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpunctuate-doc"

RDEPENDS:${PN} += ""

inherit rpm
