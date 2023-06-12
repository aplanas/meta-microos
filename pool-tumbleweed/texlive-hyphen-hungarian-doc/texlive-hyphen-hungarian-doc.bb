SUMMARY = "Documentation for texlive-hyphen-hungarian"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-hungarian"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-doc-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "9368c4181cc164189c71252e221eae3d6c594c9197a77020c8267bb826d7a307f7ec07df573e75c3ee7210a342d6fbf3196f9ed4949c86c8defbebaeebc52dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hyphen-hungarian-doc"
RDEPENDS:${PN} += "/usr/bin/ruby"

inherit rpm
