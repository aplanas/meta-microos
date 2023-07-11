SUMMARY = "Documentation for texlive-enigma"
DESCRIPTION = "This package includes the documentation for texlive-enigma"
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.1svn29802"

RPM_NAME = "texlive-enigma-doc-2023.201.0.0.1svn29802-53.2.noarch.rpm"
RPM_HASH = "03b5e57957916cc2e3d166ac7e8315bcdfce16800dc6181707fc611f59e0428cf56812a232216fa3e86cfce30ae2827df6273a3f5d610eac9e176a44f26daa6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-enigma-doc"

RDEPENDS:${PN} += ""

inherit rpm
