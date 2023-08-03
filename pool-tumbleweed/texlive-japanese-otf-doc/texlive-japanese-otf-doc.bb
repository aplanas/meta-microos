SUMMARY = "Documentation for texlive-japanese-otf"
DESCRIPTION = "This package includes the documentation for texlive-japanese-otf"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66091"

RPM_NAME = "texlive-japanese-otf-doc-2023.209.svn66091-56.1.noarch.rpm"
RPM_HASH = "52e3bb4d727d727345a29463de81edbea05f21a51131066b7625ec0312e5face09199fa6e92f36ac3f8d9386532829e709983e635ea2a6e1af5a4657bdae8ff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-japanese-otf-doc-en;ja \
texlive-japanese-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
