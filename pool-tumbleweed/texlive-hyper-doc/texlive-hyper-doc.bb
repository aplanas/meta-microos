SUMMARY = "Documentation for texlive-hyper"
DESCRIPTION = "This package includes the documentation for texlive-hyper"
LICENSE = "LPPL-1.0"

PV = "2023.208.4.2dsvn17357"

RPM_NAME = "texlive-hyper-doc-2023.208.4.2dsvn17357-53.1.noarch.rpm"
RPM_HASH = "69946981b659e1ea73ca2675607221ec76e6e8e5a058e314d4cdd27121bfc25198f4deb57b764d50b49b77563fdf9bb8168ba0556024356cf187a385f53c6112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
