SUMMARY = "Documentation for texlive-babel-belarusian"
DESCRIPTION = "This package includes the documentation for texlive-babel-belarusian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-doc-2023.209.1.5svn49022-54.1.noarch.rpm"
RPM_HASH = "e1fc0237ff17a5d72c8478a1e4e5d85f878f259af2f9f799f788b33daaaebbadc8bd254519561c4c519169a9378d508e5bcae55912fa79440cc3710c65bcf851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-belarusian-doc"

RDEPENDS:${PN} += ""

inherit rpm
