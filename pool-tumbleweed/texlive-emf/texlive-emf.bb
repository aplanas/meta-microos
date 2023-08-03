SUMMARY = "Support for the EMF symbol"
DESCRIPTION = "This package provides LaTeX support for the symbol for the EMF \
in electric circuits and electrodynamics. It provides support \
for multiple symbols but does not provide any fonts. The fonts \
themselves must be aquired otherwise. However the fonts are \
part of a normal TeX Live installation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1svn42023"

RPM_NAME = "texlive-emf-2023.209.1svn42023-54.1.noarch.rpm"
RPM_HASH = "cb2c3b7c56ad4965eb1ed01f6267339763f4f6340cb819de6cf60b5fffba383e2a51e9816eb21e75bf32a17126f6ede6a157ea81673a2215654651cfaa7d3b09"
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
