SUMMARY = "Typeset recipes"
DESCRIPTION = "The package typesets recipes according to the style used in a \
well-respected German cookery book."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-2023.204.0.0.9bsvn15878-54.1.noarch.rpm"
RPM_HASH = "abe2abd17f3fc6bc2d0b07b7690cb63e22126f79ac69bf6f53dc961498a3b79d0fa16fdb2776c502d23a4d07df4c33ff22266f9ee990fe3626f2d22cf424412b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cooking.sty) \
texlive-cooking"
RDEPENDS:${PN} += "/bin/sh \
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
