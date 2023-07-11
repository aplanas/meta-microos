SUMMARY = "Documentation for texlive-import"
DESCRIPTION = "This package includes the documentation for texlive-import"
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.6.2svn54683"

RPM_NAME = "texlive-import-doc-2023.208.6.2svn54683-53.1.noarch.rpm"
RPM_HASH = "1c446af54d2b9daaf53cac389ce7f5c83be9f10dad65272f1303c0b086c22e8b15e73a8b85513f8b2d17fde861b0d239e248fc3df4397b3d57a607e4308fa3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-import-doc"

RDEPENDS:${PN} += ""

inherit rpm
