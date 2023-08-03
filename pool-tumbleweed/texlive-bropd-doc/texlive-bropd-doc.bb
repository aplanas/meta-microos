SUMMARY = "Documentation for texlive-bropd"
DESCRIPTION = "This package includes the documentation for texlive-bropd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn35383"

RPM_NAME = "texlive-bropd-doc-2023.209.1.2svn35383-53.1.noarch.rpm"
RPM_HASH = "6089a2fbe9cc643379b6cf6f1d01df3d4a719ed62fb44b26226d799433dd8a0be8ef946e1b6b8d25067a9e60578fcaf5d52146d32c47da3cb4d6d0e11dcb28b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bropd-doc"

RDEPENDS:${PN} += ""

inherit rpm
