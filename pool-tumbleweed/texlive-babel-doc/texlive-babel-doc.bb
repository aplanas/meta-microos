SUMMARY = "Documentation for texlive-babel"
DESCRIPTION = "This package includes the documentation for texlive-babel"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.86svn65823"

RPM_NAME = "texlive-babel-doc-2023.209.3.86svn65823-54.1.noarch.rpm"
RPM_HASH = "e0bb8e62b8e70b30ce4de5a2ee79d337819d7b8d68353a725dd9c189442065ee4ded2a2b2de5c67dd56c48ede0d2bca004ea25d204a1870c8da6708e82cf7c0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-doc"

RDEPENDS:${PN} += ""

inherit rpm
