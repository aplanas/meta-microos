SUMMARY = "Documentation for texlive-pst-qtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-qtree-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "ca05d53ee12a7954e086ee567c2f13e8c12e7383be58910ae8d28dabf5694d6d6cb6d1c1c22a6c56dfa900213aeabbb42ab3edd96e8706a14e879a2dabeb8156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
