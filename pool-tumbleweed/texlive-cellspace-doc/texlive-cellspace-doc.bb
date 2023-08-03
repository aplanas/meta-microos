SUMMARY = "Documentation for texlive-cellspace"
DESCRIPTION = "This package includes the documentation for texlive-cellspace"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.0svn61501"

RPM_NAME = "texlive-cellspace-doc-2023.209.1.9.0svn61501-53.1.noarch.rpm"
RPM_HASH = "5d692de450bcf45fdd0ab22e2033ee25226f412ca30dc57d1a0917387c1cd55ef6b7561283905ba61cde949666e4114ec889da8e9aff6f5277775eb41bddcea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
