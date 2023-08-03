SUMMARY = "Documentation for texlive-pawpict"
DESCRIPTION = "This package includes the documentation for texlive-pawpict"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn21629"

RPM_NAME = "texlive-pawpict-doc-2023.209.1.0svn21629-52.1.noarch.rpm"
RPM_HASH = "00298b249a2fc9225167199de2210ca05a2df0b0c03e26c196996228de675a17edc8e2e37a8e8aa590e12737c70658e4d6f2aa5f49ae9c9a2c6956812433219e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pawpict-doc"

RDEPENDS:${PN} += ""

inherit rpm
