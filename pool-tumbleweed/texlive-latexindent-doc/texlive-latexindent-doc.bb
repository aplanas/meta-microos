SUMMARY = "Documentation for texlive-latexindent"
DESCRIPTION = "This package includes the documentation for texlive-latexindent"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.20.3svn65937"

RPM_NAME = "texlive-latexindent-doc-2023.209.3.20.3svn65937-55.1.noarch.rpm"
RPM_HASH = "852054ec01ee1279c68e364c835eb5d6de55da82de5bacb60110a7cc7774f7eb716d1612e3febfb1cc5ef042d6969e10ea57608a6a40bb73c87b15e48db25fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexindent-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
