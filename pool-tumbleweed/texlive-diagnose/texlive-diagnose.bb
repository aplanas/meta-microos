SUMMARY = "A diagnostic tool for a TeX installation"
DESCRIPTION = "Provides macros to assist evaluation of the capabilities of a \
TeX installation (i.e., what extensions it supports). An \
example document that examines the installation is available."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-2023.209.0.0.2svn19387-53.1.noarch.rpm"
RPM_HASH = "968225a7b2f52dbe6720e4da5a5c87833e3fc4ac914b647e5992472f1f857a68dbc3c9c854e44e00722fe445a4429817b1daf97e0e4187fb8409b080a07f6acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diagnose.sty \
texlive-diagnose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
