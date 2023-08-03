SUMMARY = "Documentation for texlive-uwa-pif"
DESCRIPTION = "This package includes the documentation for texlive-uwa-pif"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pif-doc-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "9ac872ec8d8371f51b9144fc4383f7fe63d8871bc8a41729880fe2d453aa70ad19066de29e67b8a3e9ae9dc64a53bcdaeedcc373a28ed58148c025e3a8f6b9fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-pif-doc"

RDEPENDS:${PN} += ""

inherit rpm
