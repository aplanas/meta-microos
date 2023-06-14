SUMMARY = "Support for the EMF symbol"
DESCRIPTION = "This package provides LaTeX support for the symbol for the EMF \
in electric circuits and electrodynamics. It provides support \
for multiple symbols but does not provide any fonts. The fonts \
themselves must be aquired otherwise. However the fonts are \
part of a normal TeX Live installation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn42023"

RPM_NAME = "texlive-emf-2023.201.1svn42023-53.1.noarch.rpm"
RPM_HASH = "684076ed2fb0b1f030d25694a5c3573b4317b8828f4d950aeb465509711c4781de78d60e32dae8db8c59fb9c5cab555c097505e08a7d24064f680a23546b3bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emf.sty \
texlive-emf"

RDEPENDS:${PN} += "/bin/sh \
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
