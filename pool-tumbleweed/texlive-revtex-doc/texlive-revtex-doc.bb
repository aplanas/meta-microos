SUMMARY = "Documentation for texlive-revtex"
DESCRIPTION = "This package includes the documentation for texlive-revtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2esvn56591"

RPM_NAME = "texlive-revtex-doc-2023.209.4.2esvn56591-54.1.noarch.rpm"
RPM_HASH = "b81eadd8a51798526813c855fac1c71a1cd4755183ae9f98cc35ce47f2808d0fd1d6a4a1cfbb7b26cd759db842e6578d092f0ddf20daf9a244a640ff0704c0d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
