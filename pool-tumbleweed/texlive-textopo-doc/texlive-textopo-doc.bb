SUMMARY = "Documentation for texlive-textopo"
DESCRIPTION = "This package includes the documentation for texlive-textopo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.5svn23796"

RPM_NAME = "texlive-textopo-doc-2023.209.1.5svn23796-55.1.noarch.rpm"
RPM_HASH = "99493bccea9ca9c2661443e656d0be819acc1d8e29575a1e3f6b6f059f8faee60bfed260ee7039c4a2e99dc51ac2937aed45e33108ecb58ba9db83264d92af33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textopo-doc"

RDEPENDS:${PN} += ""

inherit rpm
