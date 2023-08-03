SUMMARY = "Documentation for texlive-tracklang"
DESCRIPTION = "This package includes the documentation for texlive-tracklang"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.1svn65263"

RPM_NAME = "texlive-tracklang-doc-2023.209.1.6.1svn65263-53.1.noarch.rpm"
RPM_HASH = "15f004d11d03f4d18433418ae3a5af7bd72d42c24081acbb4cad5644b8d05158923522cf36ede1b798c1e5728bdb489a349e6eda5178d448988ec88d0000572d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tracklang-doc"

RDEPENDS:${PN} += ""

inherit rpm
