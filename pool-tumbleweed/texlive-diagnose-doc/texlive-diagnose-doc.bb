SUMMARY = "Documentation for texlive-diagnose"
DESCRIPTION = "This package includes the documentation for texlive-diagnose"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-doc-2023.201.0.0.2svn19387-52.1.noarch.rpm"
RPM_HASH = "6feb9ba7c201e4acc9f9a9d9359e0f9b00799f4217f5c28ecfb3a9c4d59ab9fef6d2571bf7d8b5e615bf11a31dacfee6805def4062ecdca9219b099fef43f301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagnose-doc"

RDEPENDS:${PN} += ""

inherit rpm
