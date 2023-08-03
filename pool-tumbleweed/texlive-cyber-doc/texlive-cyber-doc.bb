SUMMARY = "Documentation for texlive-cyber"
DESCRIPTION = "This package includes the documentation for texlive-cyber"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn46776"

RPM_NAME = "texlive-cyber-doc-2023.209.2.2svn46776-55.1.noarch.rpm"
RPM_HASH = "f9713049aeaaf52deab989d4ac6001a0501359c1eb4210e42d408addf64be8851f8597bce5f92ee09063e555c895c4a41a97fa0d7a4d8279d7bf8cb28d57faad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyber-doc"

RDEPENDS:${PN} += ""

inherit rpm
