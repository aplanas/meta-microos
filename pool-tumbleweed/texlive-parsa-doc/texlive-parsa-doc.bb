SUMMARY = "Documentation for texlive-parsa"
DESCRIPTION = "This package includes the documentation for texlive-parsa"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn54840"

RPM_NAME = "texlive-parsa-doc-2023.209.1.3svn54840-52.1.noarch.rpm"
RPM_HASH = "1f83e68cad10722201e42a84a2cda5d2e95857f011a42532c316a798b75511efc2c9dbe2ee499a35a28ee66a191270517cfd3a88338a262cb7130fd9599bf423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-parsa-doc-fa \
texlive-parsa-doc"

RDEPENDS:${PN} += ""

inherit rpm
