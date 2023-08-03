SUMMARY = "Documentation for texlive-reotex"
DESCRIPTION = "This package includes the documentation for texlive-reotex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34924"

RPM_NAME = "texlive-reotex-doc-2023.209.1.1svn34924-54.1.noarch.rpm"
RPM_HASH = "3631a4cd50f29c06ca6aa67318869331e52bd194dd0be0d3f8a39ccb9b825ebd50839c0e726c3fc3ef2715a5bdff0597e3169f678b27dbbff791f02ad279b79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
