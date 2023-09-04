SUMMARY = "Documentation for texlive-gnu-freefont"
DESCRIPTION = "This package includes the documentation for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-gnu-freefont-doc-2023.209.svn29349-54.2.noarch.rpm"
RPM_HASH = "5606fd93e219537959048e432f6508c071f0650873032cd72badcc0a0e3f5ffb9a1dcec231c06c6558f3d8a2326231997e29f629d9d467bedd83c27a03086fa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
