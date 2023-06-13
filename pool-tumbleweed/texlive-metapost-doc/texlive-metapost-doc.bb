SUMMARY = "Documentation for texlive-metapost"
DESCRIPTION = "This package includes the documentation for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn66264"

RPM_NAME = "texlive-metapost-doc-2023.201.svn66264-54.1.noarch.rpm"
RPM_HASH = "3833fde285c6cce9875e9c111ebb7632b17fd80a10547dd1bdd29fdd7fa75c9818893a9072b2f82b98d5a13c04f7b879300297a32a6173460b9d343790e18ce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvitomp.1) \
man(mpost.1) \
texlive-metapost-doc"

RDEPENDS:${PN} += ""

inherit rpm
