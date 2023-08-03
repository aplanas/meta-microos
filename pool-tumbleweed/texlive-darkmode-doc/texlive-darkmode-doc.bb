SUMMARY = "Documentation for texlive-darkmode"
DESCRIPTION = "This package includes the documentation for texlive-darkmode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64271"

RPM_NAME = "texlive-darkmode-doc-2023.209.1.0.1svn64271-55.1.noarch.rpm"
RPM_HASH = "9e2d5adf6445a99c45f127cc8750e2305b0caa629acb829cf2c7b9be828629aab0da7bcee4c4d8cc9ec1af68b56bd2d1502bf2f72343c26d15e74e7f25181944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-darkmode-doc"

RDEPENDS:${PN} += ""

inherit rpm
