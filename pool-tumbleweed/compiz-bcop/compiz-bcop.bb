SUMMARY = "Compiz option code generator"
DESCRIPTION = "Compiz option code generator needed to build some plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-bcop-0.8.18-1.9.noarch.rpm"
RPM_HASH = "055aa29eb06cbc324abc6d867ec5c027542b791a106aff68cad0ef77fd38412f3293ffc77936840128d89bfe5e20daf5505a9b26dc3f2e983f70527531260982"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-bcop \
compiz-bcop-devel \
pkgconfig-bcop"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
xsltproc"

inherit rpm
