SUMMARY = "Documentation for texlive-pdfmarginpar"
DESCRIPTION = "This package includes the documentation for texlive-pdfmarginpar"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.92svn23492"

RPM_NAME = "texlive-pdfmarginpar-doc-2023.209.0.0.92svn23492-52.1.noarch.rpm"
RPM_HASH = "c4c2cd2a6c4fa2841dd6f3e2e19a8fd794677a017bd7c7b705692877e0115fcfd879ddd84d548a8c14072008752492ffd22bccd8c0ef89b0b02370bdb557b8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmarginpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
