SUMMARY = "Documentation for texlive-cjk"
DESCRIPTION = "This package includes the documentation for texlive-cjk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.8.5svn60865"

RPM_NAME = "texlive-cjk-doc-2023.201.4.8.5svn60865-53.1.noarch.rpm"
RPM_HASH = "a0820a22b9ac61fe562b93734fb2592f71f376727ef066a006dcb1986a35d946d8fbc7d4b350aaaae64b705f8c5af1bc517e1cc5dff805e2b7eeb5fffc457cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjk-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
