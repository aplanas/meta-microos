SUMMARY = "Documentation for texlive-quran"
DESCRIPTION = "This package includes the documentation for texlive-quran"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.81svn57601"

RPM_NAME = "texlive-quran-doc-2023.209.1.81svn57601-54.2.noarch.rpm"
RPM_HASH = "2390f38f115fea0e7f8246fabb21d155e66a7c21e3044b854e7b385446f5510c7ea557f53858634bcbe44ec859fb9eda9c039c0fb3f352df3b0e724481f5684f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-doc"

RDEPENDS:${PN} += ""

inherit rpm
