SUMMARY = "Documentation for texlive-modular"
DESCRIPTION = "This package includes the documentation for texlive-modular"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44142"

RPM_NAME = "texlive-modular-doc-2023.201.svn44142-54.1.noarch.rpm"
RPM_HASH = "737c9237fa025bc2db738a463c2cfc6633341594162f83bbd16785a7a874cfed638116086deb3c836d6ac655bea68497bb13407afb122a5a3c93d07d0762b74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modular-doc"

RDEPENDS:${PN} += ""

inherit rpm
