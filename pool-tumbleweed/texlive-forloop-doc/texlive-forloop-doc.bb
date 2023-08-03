SUMMARY = "Documentation for texlive-forloop"
DESCRIPTION = "This package includes the documentation for texlive-forloop"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.3.0svn15878"

RPM_NAME = "texlive-forloop-doc-2023.209.3.0svn15878-53.1.noarch.rpm"
RPM_HASH = "a56c904c24fffb5d60b66bd4a61ab2c064375fe46d8e90a6a3a2a8f1aca83e1c4903731d5677849103dce504da23292cd37361d0e766d62ac80ad9092ad53fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forloop-doc"

RDEPENDS:${PN} += ""

inherit rpm
