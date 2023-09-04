SUMMARY = "Documentation for texlive-quantikz"
DESCRIPTION = "This package includes the documentation for texlive-quantikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-doc-2023.209.0.0.9.6svn54911-54.2.noarch.rpm"
RPM_HASH = "fe21db9a00d29e4a951f2c27392c7c11be0fec61a71e172d71b5f5204e05e9905238d906b22a9dc8b7bd36fa23b4f580cbafdb2b1396b1680d33a67c0b7690a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quantikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
