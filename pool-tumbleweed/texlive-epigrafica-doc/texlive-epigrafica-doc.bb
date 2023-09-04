SUMMARY = "Documentation for texlive-epigrafica"
DESCRIPTION = "This package includes the documentation for texlive-epigrafica"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.01svn17210"

RPM_NAME = "texlive-epigrafica-doc-2023.209.1.01svn17210-54.2.noarch.rpm"
RPM_HASH = "e8e13d21fe7a9fee39bc11e1bd657c9569fba8e7c66a3ca0b99a90b41243b835bd2e946da32ed2ef1be5b859fb8a5b675174b88f10750a346464aea5ea0f2cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigrafica-doc"

RDEPENDS:${PN} += ""

inherit rpm
