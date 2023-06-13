SUMMARY = "Documentation for texlive-tabvar"
DESCRIPTION = "This package includes the documentation for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn63921"

RPM_NAME = "texlive-tabvar-doc-2023.201.1.8svn63921-54.1.noarch.rpm"
RPM_HASH = "c8155d2eea149bc52754d4541260f946696013eac3c49ca2b444277afb061586b9fe33fbbddf10555e5b3566e6098984169cfd6ae5fe31e5c49f07f4de18d717"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-tabvar-doc:fr) \
texlive-tabvar-doc"

RDEPENDS:${PN} += ""

inherit rpm
