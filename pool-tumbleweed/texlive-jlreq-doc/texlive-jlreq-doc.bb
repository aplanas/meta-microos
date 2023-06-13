SUMMARY = "Documentation for texlive-jlreq"
DESCRIPTION = "This package includes the documentation for texlive-jlreq"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66362"

RPM_NAME = "texlive-jlreq-doc-2023.201.svn66362-55.1.noarch.rpm"
RPM_HASH = "2c6a39960ad1d89840b793df6ee3dd9ac4f23c1d6f27113ae87d066413cd5af2049d82efff3d0110543a8a54c89bfa6ab5d07dc6a5587f76863350b98d2757e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-jlreq-doc:ja) \
texlive-jlreq-doc"

RDEPENDS:${PN} += ""

inherit rpm
