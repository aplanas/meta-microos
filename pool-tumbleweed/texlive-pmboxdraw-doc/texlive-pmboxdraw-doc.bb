SUMMARY = "Documentation for texlive-pmboxdraw"
DESCRIPTION = "This package includes the documentation for texlive-pmboxdraw"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn53046"

RPM_NAME = "texlive-pmboxdraw-doc-2023.201.1.4svn53046-52.1.noarch.rpm"
RPM_HASH = "f41185995e82f1e69d870786b6f60be3dc8d8b3d49ba2b4f83c35c86256cf9d78d5bbdc875d0d164ca874e85d8b30e996ec38c51a0e8ae1df825edb8b6c23cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmboxdraw-doc"
RDEPENDS:${PN} += ""

inherit rpm
