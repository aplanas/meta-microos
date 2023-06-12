SUMMARY = "Documentation for texlive-pedigree-perl"
DESCRIPTION = "This package includes the documentation for texlive-pedigree-perl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.1svn64227"

RPM_NAME = "texlive-pedigree-perl-doc-2023.201.2.1svn64227-51.1.noarch.rpm"
RPM_HASH = "e2f0122152ca3503d2ec2f589827bd3f430cefb2ecd8665419ac9d97797698ec0071341b03e2124efa68a58bf0e0d610ab96a1b737cbc925ea6b181227ef4582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(pedigree.1) \
texlive-pedigree-perl-doc"
RDEPENDS:${PN} += ""

inherit rpm
