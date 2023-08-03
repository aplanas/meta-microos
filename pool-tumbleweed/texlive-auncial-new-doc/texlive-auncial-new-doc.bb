SUMMARY = "Documentation for texlive-auncial-new"
DESCRIPTION = "This package includes the documentation for texlive-auncial-new"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn62977"

RPM_NAME = "texlive-auncial-new-doc-2023.209.2.0svn62977-54.1.noarch.rpm"
RPM_HASH = "8787adf6cf724e82fe845441bc6cae863771c81601dd044c1d03cd68dbc2c0d40f5b2804c3841be6d063e61bd052177ebeb3c65a6336de08828912049434eac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auncial-new-doc"

RDEPENDS:${PN} += ""

inherit rpm
