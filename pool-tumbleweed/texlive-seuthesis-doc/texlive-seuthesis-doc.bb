SUMMARY = "Documentation for texlive-seuthesis"
DESCRIPTION = "This package includes the documentation for texlive-seuthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1.2svn33042"

RPM_NAME = "texlive-seuthesis-doc-2023.209.2.1.2svn33042-54.1.noarch.rpm"
RPM_HASH = "b9514c9cd784a35fec2a7524a234a4a3e7fb89fb991726c44ec042f086674abef616b2d2a4d8e02c0242788e43e0f59882f50100fb48379f17be8120c137eb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-seuthesis-doc-zh \
texlive-seuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
