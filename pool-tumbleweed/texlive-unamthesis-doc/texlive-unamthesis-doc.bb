SUMMARY = "Documentation for texlive-unamthesis"
DESCRIPTION = "This package includes the documentation for texlive-unamthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43639"

RPM_NAME = "texlive-unamthesis-doc-2023.209.2.1svn43639-54.1.noarch.rpm"
RPM_HASH = "785752614f965dfbf179545e9639eaec67b70d4666e65f536e01597f584c5779a5c32cba2dbb1486ed9c4e28b04e69e7e069dc7d226036541b5a4a7494d41dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
