SUMMARY = "Documentation for texlive-pdflatexpicscale"
DESCRIPTION = "This package includes the documentation for texlive-pdflatexpicscale"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.32svn46617"

RPM_NAME = "texlive-pdflatexpicscale-doc-2023.209.0.0.32svn46617-52.1.noarch.rpm"
RPM_HASH = "4f651182d5da7a1a9e0d1b6a2a29d16e1fb940e03fa421fe37b60ce8a939ec4eac4c2afd1b13202540b43a4622caf2499c92d36fe39c4ab7ed2cef8e7535f201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdflatexpicscale-doc"

RDEPENDS:${PN} += ""

inherit rpm
