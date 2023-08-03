SUMMARY = "Documentation for texlive-niceframe-type1"
DESCRIPTION = "This package includes the documentation for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44671"

RPM_NAME = "texlive-niceframe-type1-doc-2023.209.svn44671-55.1.noarch.rpm"
RPM_HASH = "6c82e3c34671fc03db1172e112a576de80df7f28cb9effaddf60ff63aab51884835d8aaa1cbec264028361d5465335eb65f39c85a394e2ced0c598533aca9048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
