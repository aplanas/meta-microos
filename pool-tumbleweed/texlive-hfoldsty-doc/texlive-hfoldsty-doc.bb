SUMMARY = "Documentation for texlive-hfoldsty"
DESCRIPTION = "This package includes the documentation for texlive-hfoldsty"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.15svn29349"

RPM_NAME = "texlive-hfoldsty-doc-2023.209.1.15svn29349-54.2.noarch.rpm"
RPM_HASH = "8ed5b0d615e656244c6ae23167cd874d5b5d6e7a75750b0c30122b9d7a5f6ad294f6760a53c45720866735a49156512dc7e2b69616a5d9e86303f2555273c581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfoldsty-doc"

RDEPENDS:${PN} += ""

inherit rpm
