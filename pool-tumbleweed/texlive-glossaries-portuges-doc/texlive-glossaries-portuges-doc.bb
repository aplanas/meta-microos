SUMMARY = "Documentation for texlive-glossaries-portuges"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-portuges"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-doc-2023.201.1.1svn36064-53.2.noarch.rpm"
RPM_HASH = "98f65caee43e01425c1e5136c6dc1893a32ae857e11d161bef55e550aa3335b9745cbc81188bec0ea52aef462d1896042999919f6655ee7e78df950f4bff1d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
