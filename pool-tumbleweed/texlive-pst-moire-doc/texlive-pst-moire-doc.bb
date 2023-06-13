SUMMARY = "Documentation for texlive-pst-moire"
DESCRIPTION = "This package includes the documentation for texlive-pst-moire"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn60411"

RPM_NAME = "texlive-pst-moire-doc-2023.201.2.2svn60411-52.1.noarch.rpm"
RPM_HASH = "7e60831375129c14a2ddc5614d1102792d3bab1f28a5099a7e6391fec8315b29975020ae2dc08114b5f026e87d06cb780701caa3c6d4df103048597ef3ae7dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-moire-doc"

RDEPENDS:${PN} += ""

inherit rpm
