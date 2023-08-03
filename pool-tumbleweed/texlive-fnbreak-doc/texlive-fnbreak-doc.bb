SUMMARY = "Documentation for texlive-fnbreak"
DESCRIPTION = "This package includes the documentation for texlive-fnbreak"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn25003"

RPM_NAME = "texlive-fnbreak-doc-2023.209.1.30svn25003-53.1.noarch.rpm"
RPM_HASH = "f21d20064862bb934cb48f5e68e4c71f2948c82c3de7e799078dd80a556c4cb53f20f56df6f49c7852b8fc358d57bb47f0957be27aa3e5557226e67d44288cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnbreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
