SUMMARY = "Documentation for texlive-rlepsf"
DESCRIPTION = "This package includes the documentation for texlive-rlepsf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19082"

RPM_NAME = "texlive-rlepsf-doc-2023.209.svn19082-54.2.noarch.rpm"
RPM_HASH = "c6ae152001f624de913083efda5749297699d79e2a55edefe4d8adac22a8d339ca8dd4418fd631ed9be6601c7c1bf73c4a5d515e9e1e104d8b149d840a49012b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rlepsf-doc"

RDEPENDS:${PN} += ""

inherit rpm
