SUMMARY = "Documentation for texlive-statex"
DESCRIPTION = "This package includes the documentation for texlive-statex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn20306"

RPM_NAME = "texlive-statex-doc-2023.209.1.6svn20306-58.1.noarch.rpm"
RPM_HASH = "5f6593890d705aca98e2d5d1fb4675d7971bc3f4480a064d7e1ab94f4806ae676fca25e0a359391d7c566262cfaeb7a9d478bc91d86b9a1c002c3acfd9dfd079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statex-doc"

RDEPENDS:${PN} += ""

inherit rpm
