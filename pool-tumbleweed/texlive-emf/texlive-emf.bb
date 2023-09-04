SUMMARY = "Support for the EMF symbol"
DESCRIPTION = "This package provides LaTeX support for the symbol for the EMF \
in electric circuits and electrodynamics. It provides support \
for multiple symbols but does not provide any fonts. The fonts \
themselves must be aquired otherwise. However the fonts are \
part of a normal TeX Live installation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn42023"

RPM_NAME = "texlive-emf-2023.209.1svn42023-54.2.noarch.rpm"
RPM_HASH = "67bf8fcbec99db21a2ffaff2f4bffe141345e754171fc6f8ead5615602ceb89cb95d8b64995798a872b05f17c1ad824b98499fb540e8b04a69d138f8642d61ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emf.sty \
texlive-emf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
