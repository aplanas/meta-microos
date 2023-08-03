SUMMARY = "Documentation for texlive-ektype-tanka"
DESCRIPTION = "This package includes the documentation for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-doc-2023.209.0.0.2svn63255-54.1.noarch.rpm"
RPM_HASH = "d03b2bec074805dbbc2d376c4da1d67206deccf82e2dc89034acab02165d96edb94dd3ed9eb189f66b3af4839ff2944be1a5cda49504e496c30beb8fa5c02fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hi) \
locale(texlive-ektype-tanka-doc-mr \
texlive-ektype-tanka-doc"

RDEPENDS:${PN} += ""

inherit rpm
