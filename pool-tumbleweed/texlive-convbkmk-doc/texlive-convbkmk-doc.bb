SUMMARY = "Documentation for texlive-convbkmk"
DESCRIPTION = "This package includes the documentation for texlive-convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.30svn49252"

RPM_NAME = "texlive-convbkmk-doc-2023.204.0.0.30svn49252-54.1.noarch.rpm"
RPM_HASH = "b10860aa4324ee08b3f7e985477f645e5f21f47b9e5080d4a8a4844b01a601afdeee5953028b554363af8b8223e91f0beb71f9810947868728e7a67dc517368f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-convbkmk-doc"
RDEPENDS:${PN} += ""

inherit rpm
