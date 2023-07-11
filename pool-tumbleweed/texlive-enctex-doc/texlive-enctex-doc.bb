SUMMARY = "Documentation for texlive-enctex"
DESCRIPTION = "This package includes the documentation for texlive-enctex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn34957"

RPM_NAME = "texlive-enctex-doc-2023.201.svn34957-53.2.noarch.rpm"
RPM_HASH = "b4eb9ee8371634bbce9215587849496d44084f3aa23ab404e6bf08360105ca636c83cc27f82d8c18c1b3ceca0cb50e2c193d78a5cc93c61d156aa59ba4a5fc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-enctex-doc-en;cs \
texlive-enctex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
