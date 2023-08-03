SUMMARY = "Documentation for texlive-context-cmscbf"
DESCRIPTION = "This package includes the documentation for texlive-context-cmscbf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-cmscbf-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "7e051f11b3868d249d874a9e8effc03aa3734023910322e532df2ded106522c75a8836b5c756c52aaed5989c8f3fecf5693c40f28f71268cb0fe5cb47f88a494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cmscbf-doc"

RDEPENDS:${PN} += ""

inherit rpm
