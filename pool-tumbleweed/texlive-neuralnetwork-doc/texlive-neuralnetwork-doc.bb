SUMMARY = "Documentation for texlive-neuralnetwork"
DESCRIPTION = "This package includes the documentation for texlive-neuralnetwork"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-doc-2023.209.1.0svn31500-55.1.noarch.rpm"
RPM_HASH = "708ab515c2596ef49027d101c41df13339a0cf20896f1cb21845ced978a26ac5dc50eecef67e4abd8c73498227f40db637c4fa1bb864710721be9285b4936985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-neuralnetwork-doc"

RDEPENDS:${PN} += ""

inherit rpm
