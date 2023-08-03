SUMMARY = "Documentation for texlive-econometrics"
DESCRIPTION = "This package includes the documentation for texlive-econometrics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39396"

RPM_NAME = "texlive-econometrics-doc-2023.209.1.0svn39396-54.1.noarch.rpm"
RPM_HASH = "441029584fbc853221667d02baa94c79f067391bf5da2a8a2bd3139e16c020f376296432e04df842372ecb141c51e3e16825df77a72cbdb0eca8e12f56a04c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econometrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
