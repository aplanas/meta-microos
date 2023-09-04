SUMMARY = "Documentation for texlive-eqlist"
DESCRIPTION = "This package includes the documentation for texlive-eqlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn32257"

RPM_NAME = "texlive-eqlist-doc-2023.209.2.1svn32257-54.2.noarch.rpm"
RPM_HASH = "1d5b7465117d08322cdb2522e74cfffce7b8ab47dce2ce8c7c97a25d203529c636339e0e05ccd8f0797ef4f1617aee47df711b1f4d9165db717ebe1af4d18711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
