SUMMARY = "Documentation for texlive-cje"
DESCRIPTION = "This package includes the documentation for texlive-cje"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn46721"

RPM_NAME = "texlive-cje-doc-2023.209.1.06svn46721-54.1.noarch.rpm"
RPM_HASH = "17bf935a543a785c71fe00aed4920299ebe58e8fe919fd8377f9125f30103a603f357f528e9b6dd1a4c7391e8194e4f68ba0aecf97446ea9af0a41e5286362df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cje-doc"

RDEPENDS:${PN} += ""

inherit rpm
