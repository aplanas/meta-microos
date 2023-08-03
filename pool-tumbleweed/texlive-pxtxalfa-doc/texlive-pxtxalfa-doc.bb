SUMMARY = "Documentation for texlive-pxtxalfa"
DESCRIPTION = "This package includes the documentation for texlive-pxtxalfa"
LICENSE = "LPPL-1.0"

PV = "2023.209.2svn60847"

RPM_NAME = "texlive-pxtxalfa-doc-2023.209.2svn60847-54.1.noarch.rpm"
RPM_HASH = "6bd248f1a22acea9832e41d050ee6f887e2daa59c1214387298cc29765687dd20cda2620339a49c5813235b749e33ff0fa8d4a180e617271cf5100f76fba0b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtxalfa-doc"

RDEPENDS:${PN} += ""

inherit rpm
