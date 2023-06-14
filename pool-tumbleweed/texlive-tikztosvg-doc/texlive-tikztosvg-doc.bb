SUMMARY = "Documentation for texlive-tikztosvg"
DESCRIPTION = "This package includes the documentation for texlive-tikztosvg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3.0svn60289"

RPM_NAME = "texlive-tikztosvg-doc-2023.201.0.0.3.0svn60289-52.1.noarch.rpm"
RPM_HASH = "24c5b1c253c9448af303ecd4fbb439e0be002f9148a5f5dc2606dd7c303897058c7999681dcd0276a18a2ee7f06ada39308ef8d32310ea18285a76ac08a7e97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tikztosvg.1 \
texlive-tikztosvg-doc"

RDEPENDS:${PN} += ""

inherit rpm
