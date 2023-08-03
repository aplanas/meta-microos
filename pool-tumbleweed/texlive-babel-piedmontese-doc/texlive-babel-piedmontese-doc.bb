SUMMARY = "Documentation for texlive-babel-piedmontese"
DESCRIPTION = "This package includes the documentation for texlive-babel-piedmontese"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-doc-2023.209.1.0svn30282-54.1.noarch.rpm"
RPM_HASH = "0f94194cd1c3cab7f1b0e296829c4848f62a6f93724a8707ced9f32a0ed83e6317bb93b368a14c9ffee535b1875bc24941de850407e4c9c9ecf63a9b16fbdd0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-piedmontese-doc"

RDEPENDS:${PN} += ""

inherit rpm
