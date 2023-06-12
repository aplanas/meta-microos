SUMMARY = "Documentation for texlive-foekfont"
DESCRIPTION = "This package includes the documentation for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-foekfont-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "01b3c72328308cc1a454918fec3dfb1ef2bbdfe6b5ce99f42d44439d65d2c1fca49773f0477a07c3c63dad85cfde9ec2b9f88b333bbd05de725e1b6c88705021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foekfont-doc"
RDEPENDS:${PN} += ""

inherit rpm
