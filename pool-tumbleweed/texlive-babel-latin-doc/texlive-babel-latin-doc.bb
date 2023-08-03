SUMMARY = "Documentation for texlive-babel-latin"
DESCRIPTION = "This package includes the documentation for texlive-babel-latin"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn59800"

RPM_NAME = "texlive-babel-latin-doc-2023.209.4.0svn59800-54.1.noarch.rpm"
RPM_HASH = "386026d0f186655d07fedbdd56236d4cc2d441430d4c66ed8a583e5f8fa11f80cf43089b243217d4783329efeea2571d2a41f3098809ff8d03ed49e4dfa7c27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-latin-doc"

RDEPENDS:${PN} += ""

inherit rpm
