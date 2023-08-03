SUMMARY = "Documentation for texlive-colourchange"
DESCRIPTION = "This package includes the documentation for texlive-colourchange"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.22svn21741"

RPM_NAME = "texlive-colourchange-doc-2023.209.1.22svn21741-54.1.noarch.rpm"
RPM_HASH = "b1a3ffae704e1aebb6b5d18692f3c6798e705a5966cec9eb200f2476abd5988bd5c97959fe5a82e4cdbe004f9658e614d4de4ffc17fbd59ef44910381fd5b493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colourchange-doc"

RDEPENDS:${PN} += ""

inherit rpm
