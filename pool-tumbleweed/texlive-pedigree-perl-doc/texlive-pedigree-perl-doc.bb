SUMMARY = "Documentation for texlive-pedigree-perl"
DESCRIPTION = "This package includes the documentation for texlive-pedigree-perl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-doc-2023.209.2.1svn64227-52.1.noarch.rpm"
RPM_HASH = "05476fc4ac69535950ca38a9421489004c1fcff38167631726decee9f0ab72645f9051fc10dfcd530dd40cc835406682cdfbb06e1e3dae7aaa653e244b88bf91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pedigree.1 \
texlive-pedigree-perl-doc"

RDEPENDS:${PN} += ""

inherit rpm
