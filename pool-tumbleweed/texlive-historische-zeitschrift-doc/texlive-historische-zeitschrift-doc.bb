SUMMARY = "Documentation for texlive-historische-zeitschrift"
DESCRIPTION = "This package includes the documentation for texlive-historische-zeitschrift"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn42635"

RPM_NAME = "texlive-historische-zeitschrift-doc-2023.209.1.2svn42635-54.1.noarch.rpm"
RPM_HASH = "99bf7fc0705dbd04485952f921436441b70aecafe9d4b20e3257089280d49a3268bb7ecc94ec879593c5b452e5144af6dd5fc2eda813d5d0ba82504e677f78e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-historische-zeitschrift-doc-de;en \
texlive-historische-zeitschrift-doc"

RDEPENDS:${PN} += ""

inherit rpm
