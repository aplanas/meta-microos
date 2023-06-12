SUMMARY = "Documentation for texlive-sidenotesplus"
DESCRIPTION = "This package includes the documentation for texlive-sidenotesplus"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn63867"

RPM_NAME = "texlive-sidenotesplus-doc-2023.201.1.02svn63867-53.1.noarch.rpm"
RPM_HASH = "3344e75050bb3a5c8c56bcf2808b707307c8a9fa6355f37eba4211c0cf10786878265eaa92b97137a6005af8df4211b6ddec85f3c307c39482676aea8f0c7bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotesplus-doc"
RDEPENDS:${PN} += ""

inherit rpm
