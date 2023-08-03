SUMMARY = "Documentation for texlive-swimgraf"
DESCRIPTION = "This package includes the documentation for texlive-swimgraf"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25446"

RPM_NAME = "texlive-swimgraf-doc-2023.209.svn25446-58.1.noarch.rpm"
RPM_HASH = "c821c493876d970c7bc5ebd0a29c012c1d09a6d8ef6f009a6e5891d5ac892b8ff8d93b090637bade9066f5feda75115acf604f184d8d60ed137b7d485a29a834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swimgraf-doc"

RDEPENDS:${PN} += ""

inherit rpm
