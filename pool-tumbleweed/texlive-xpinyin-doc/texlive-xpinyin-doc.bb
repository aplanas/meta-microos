SUMMARY = "Documentation for texlive-xpinyin"
DESCRIPTION = "This package includes the documentation for texlive-xpinyin"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn66115"

RPM_NAME = "texlive-xpinyin-doc-2023.201.3.1svn66115-52.1.noarch.rpm"
RPM_HASH = "e4a6d064cb911996c4ab5d4c5a4e4df22230c70c7ddcf3ac3ae6a5df45460688151f0ab789363e1b9d660b1460c453cf24fe26f54c384272f48c4b0770226cee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xpinyin-doc-zh \
texlive-xpinyin-doc"

RDEPENDS:${PN} += ""

inherit rpm
