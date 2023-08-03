SUMMARY = "Documentation for texlive-semtex"
DESCRIPTION = "This package includes the documentation for texlive-semtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.45svn56530"

RPM_NAME = "texlive-semtex-doc-2023.209.0.0.45svn56530-54.1.noarch.rpm"
RPM_HASH = "9846ab2dfc08bdbf66839a055344d4d10de8b15de6b94cbfa44c0c43348197027bff8407185501ee80f2dc19cc2a960149bdc32d63c63a4847d445a2cf780cf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
