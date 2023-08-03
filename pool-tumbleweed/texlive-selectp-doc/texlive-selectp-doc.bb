SUMMARY = "Documentation for texlive-selectp"
DESCRIPTION = "This package includes the documentation for texlive-selectp"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn20185"

RPM_NAME = "texlive-selectp-doc-2023.209.1.0svn20185-54.1.noarch.rpm"
RPM_HASH = "99809982293debb05e1dccb68b6a38abbfadb04dbbd099c566e36e5cdb25dcac351560fd97fe3539e1be5a3b50cd2c03bf85d9f3d2c17fc65a1bad53f52ab856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selectp-doc"

RDEPENDS:${PN} += ""

inherit rpm
