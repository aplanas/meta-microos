SUMMARY = "LaTeX support for the eiad font"
DESCRIPTION = "The package provides macros to support use of the eiad fonts in \
OT1 encoding. Also offered are a couple of Metafont files \
described in the font package, but not provided there."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-eiad-ltx-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "b8e425f8029d875dd40a6a9fa805d169a655c682dafab0d34fb386e0a1ff28668971d68fb896b613322ed9d02e489997f5157371fa8aeb8bc087bb18b90e6be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eiad.sty) \
texlive-eiad-ltx"

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
