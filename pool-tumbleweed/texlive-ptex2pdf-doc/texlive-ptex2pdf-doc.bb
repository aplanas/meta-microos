SUMMARY = "Documentation for texlive-ptex2pdf"
DESCRIPTION = "This package includes the documentation for texlive-ptex2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-doc-2023.201.20200520.0svn65953-53.1.noarch.rpm"
RPM_HASH = "eb322dedf73fe87ac315250ac40977127d09db8484d78cafa21e63e9cda70708976863cf79f5ef226bc5ddc6673a2a000b482614f27d78bc0216c98c9d4a1501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
