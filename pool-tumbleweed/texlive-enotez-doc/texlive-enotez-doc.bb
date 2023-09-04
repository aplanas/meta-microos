SUMMARY = "Documentation for texlive-enotez"
DESCRIPTION = "This package includes the documentation for texlive-enotez"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.10dsvn61490"

RPM_NAME = "texlive-enotez-doc-2023.209.0.0.10dsvn61490-54.2.noarch.rpm"
RPM_HASH = "e623919aafba7a09039f1034472410f6fff48ce6afc847b30e6cb5e1409a3aad140d6a2a1c1890ab4f91223ac13f5b83428ac661cf90fac0de7fd22205d1343f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enotez-doc"

RDEPENDS:${PN} += ""

inherit rpm
