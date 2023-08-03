SUMMARY = "Documentation for texlive-babel-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-babel-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4esvn56674"

RPM_NAME = "texlive-babel-ukrainian-doc-2023.209.1.4esvn56674-54.1.noarch.rpm"
RPM_HASH = "02bf3cc7eae32a18e262f97750f2ee13fe4c5a3ce84ed3a41a586c85d539652a4752e5f94d4883b517a5f00fab433732df818807c82d860ccd843bb447977848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
