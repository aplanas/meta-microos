SUMMARY = "Documentation for texlive-mkpic"
DESCRIPTION = "This package includes the documentation for texlive-mkpic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn33700"

RPM_NAME = "texlive-mkpic-doc-2023.209.1.02svn33700-55.1.noarch.rpm"
RPM_HASH = "2c62a167c883bfeec55a7016ec818cb82a93da921d827e8a9855f1194fe12f5376afabbb96f0a2943d12a869ca52d8e94f67d1dcea2056ed87a19f8fe2b4c904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
