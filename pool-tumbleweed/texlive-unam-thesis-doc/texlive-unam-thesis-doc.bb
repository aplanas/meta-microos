SUMMARY = "Documentation for texlive-unam-thesis"
DESCRIPTION = "This package includes the documentation for texlive-unam-thesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5svn51207"

RPM_NAME = "texlive-unam-thesis-doc-2023.209.0.0.5svn51207-54.1.noarch.rpm"
RPM_HASH = "ea68f3139dd975ae8a319a93cdba0f80b8f5a468586242e5100ebadd9056d1437246364753fd54c8474db179247615e3622b5256a8b3416d61d97110f4434f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unam-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
