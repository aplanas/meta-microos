SUMMARY = "Documentation for texlive-sexam"
DESCRIPTION = "This package includes the documentation for texlive-sexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn46628"

RPM_NAME = "texlive-sexam-doc-2023.209.1svn46628-54.1.noarch.rpm"
RPM_HASH = "7a23fe08ee9616dd68ea9c5c28f152b9666fe776679d58e4871593d5799269012d2caf294324f47ab38f0c704148248adbf700058b0448563de43a2efc284564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sexam-doc-ar-dz \
texlive-sexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
