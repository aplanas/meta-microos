SUMMARY = "Documentation for texlive-imac"
DESCRIPTION = "This package includes the documentation for texlive-imac"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn17347"

RPM_NAME = "texlive-imac-doc-2023.208.svn17347-53.1.noarch.rpm"
RPM_HASH = "c43db7cae6571b7a5f782d1a3bca0605a8b67cf04cf0cb724fcd202afa700891a5913b710ea1fca8c56b8a50574498e2984f6c22d53df10f309aedf47721d6c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-imac-doc"

RDEPENDS:${PN} += ""

inherit rpm
