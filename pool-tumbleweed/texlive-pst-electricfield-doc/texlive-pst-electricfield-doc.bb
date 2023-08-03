SUMMARY = "Documentation for texlive-pst-electricfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-electricfield"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-doc-2023.209.0.0.14svn29803-53.1.noarch.rpm"
RPM_HASH = "eb66aad9d1b021fda0bed190e018c0ea392be43f3f73a3a89b4b4104eb39328607f362673517aeb9fda127755e7872acbd7f55ea3fbc49ee54dfb564bdc3d957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-electricfield-doc-de;en;fr \
texlive-pst-electricfield-doc"

RDEPENDS:${PN} += ""

inherit rpm
