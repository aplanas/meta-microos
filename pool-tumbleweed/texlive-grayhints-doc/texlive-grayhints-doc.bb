SUMMARY = "Documentation for texlive-grayhints"
DESCRIPTION = "This package includes the documentation for texlive-grayhints"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn49052"

RPM_NAME = "texlive-grayhints-doc-2023.201.svn49052-53.1.noarch.rpm"
RPM_HASH = "7ede702df6d8aa319670e51846a04ff0761b58e5620c9e6acbb46219f67ce21fbc539b1e09a88516277c0b34e6108b16e78e0c990f47296d3fcdf6da272cf83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grayhints-doc"

RDEPENDS:${PN} += ""

inherit rpm
