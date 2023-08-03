SUMMARY = "Documentation for texlive-screenplay"
DESCRIPTION = "This package includes the documentation for texlive-screenplay"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn27223"

RPM_NAME = "texlive-screenplay-doc-2023.209.1.6svn27223-54.1.noarch.rpm"
RPM_HASH = "d9dbfc44bde0d1900fc3a189415998576b342e4828904426249ce74220dba61b18922265a5918a7134a46fdd956c3339658bcb50d30b0e7ccff38f20d419834c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-screenplay-doc"

RDEPENDS:${PN} += ""

inherit rpm
