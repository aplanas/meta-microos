SUMMARY = "Documentation for texlive-texfot"
DESCRIPTION = "This package includes the documentation for texlive-texfot"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.48svn65545"

RPM_NAME = "texlive-texfot-doc-2023.209.1.48svn65545-55.1.noarch.rpm"
RPM_HASH = "0bfb8740ef2b6cdb3361b9d3750acb69e62f7cc76c96ef02584dced842f9bb3150fe4d64c33c3db4d352d9050e684a64ecaadf7fd262cfab1f262f8df6a8cb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texfot.1 \
texlive-texfot-doc"

RDEPENDS:${PN} += ""

inherit rpm
