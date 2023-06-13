SUMMARY = "Documentation for texlive-tempora"
DESCRIPTION = "This package includes the documentation for texlive-tempora"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.05svn39596"

RPM_NAME = "texlive-tempora-doc-2023.201.1.05svn39596-54.1.noarch.rpm"
RPM_HASH = "0f38fd233600d28c51cf19eeb8d84bc58dea9ef42d09337c6cd69c2f89e0012ba882c69117323a02c0e2a3b69a5bb9a12fc1b0c1d075c3689e070027a2fb37bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tempora-doc"

RDEPENDS:${PN} += ""

inherit rpm
