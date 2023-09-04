SUMMARY = "Documentation for texlive-xpinyin"
DESCRIPTION = "This package includes the documentation for texlive-xpinyin"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn66115"

RPM_NAME = "texlive-xpinyin-doc-2023.209.3.1svn66115-53.2.noarch.rpm"
RPM_HASH = "23961ab0b616f5e52eb61725fcb964fe425fc5021baebdeee344006d00e188bc9396065d68aa419b87bd6b87060aa83610a3192474684ba4e42c116fd027fc85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xpinyin-doc-zh \
texlive-xpinyin-doc"

RDEPENDS:${PN} += ""

inherit rpm
