SUMMARY = "Documentation for texlive-zxjafbfont"
DESCRIPTION = "This package includes the documentation for texlive-zxjafbfont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-doc-2023.209.0.0.2svn28539-53.1.noarch.rpm"
RPM_HASH = "0ddc9f1dbc5e2d5fc6e3fab79d8a5592a5e8160af6aa0e24f16ef23a29e91003d9290e7e6ce8804139f11f62e4ef24018b4c29eb3fbeb2e243d1f54f7b95daf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zxjafbfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
