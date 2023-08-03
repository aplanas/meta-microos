SUMMARY = "Documentation for texlive-tabbing"
DESCRIPTION = "This package includes the documentation for texlive-tabbing"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59715"

RPM_NAME = "texlive-tabbing-doc-2023.209.svn59715-58.1.noarch.rpm"
RPM_HASH = "c32fbb6382a50969f2eb75de7cb5bdc8cc9729310afd222686c93310e6f62bc0b03400502d1fa3d98ecff4734eb92dc64a006d422ccb11d9c598d6f53167d43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tabbing-doc-en \
texlive-tabbing-doc"

RDEPENDS:${PN} += ""

inherit rpm
