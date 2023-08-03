SUMMARY = "Documentation for texlive-arabi"
DESCRIPTION = "This package includes the documentation for texlive-arabi"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn44662"

RPM_NAME = "texlive-arabi-doc-2023.209.1.1svn44662-55.1.noarch.rpm"
RPM_HASH = "dbac8273eb215aa169ed5635d871f9f280045c77f0e28ec74b0a88762ede88925c6e793d4ff3c42505855428d91bc4bfd4a066057ee6be3b431c7c94ba2d34aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-doc"

RDEPENDS:${PN} += ""

inherit rpm
