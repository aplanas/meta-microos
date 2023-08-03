SUMMARY = "Documentation for texlive-foilhtml"
DESCRIPTION = "This package includes the documentation for texlive-foilhtml"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-foilhtml-doc-2023.209.1.2svn61937-53.1.noarch.rpm"
RPM_HASH = "3ca68fb2c6efea14247dd4370c157af843e2a1141adb8af7e88e9655507df6a1d7b8ae89b0cf1641f26379b2c029dc2cc0323229a0b70d1ac8d8923981994219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foilhtml-doc"

RDEPENDS:${PN} += ""

inherit rpm
