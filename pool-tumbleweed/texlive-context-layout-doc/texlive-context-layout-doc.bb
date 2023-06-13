SUMMARY = "Documentation for texlive-context-layout"
DESCRIPTION = "This package includes the documentation for texlive-context-layout"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-layout-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "0b4868b66095cdbe5fc970766fdfcbfc7aa237730d17ad4ac0a973a732d9a112085711b87e12547091e7581aef0edc50510ec3f52436ab62c12fc4ae77b51695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-layout-doc"

RDEPENDS:${PN} += ""

inherit rpm
