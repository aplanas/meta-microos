SUMMARY = "A beamer inner theme which reproduces standard beamer blocks using tcolorboxes"
DESCRIPTION = "This package provides an inner theme for beamer which \
reproduces standard beamer blocks using tcolorboxes. The look \
and feel (rounded/sharp corners, shadows and colours) will \
automatically adapt to which other themes are loaded."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64387"

RPM_NAME = "texlive-beamertheme-tcolorbox-2023.201.0.0.5svn64387-53.1.noarch.rpm"
RPM_HASH = "53092a2a7098a45c312e3da9c834a705b5c57964975a2f099d40c9401b9706b1821090fa859a64989f8ad5f1fd580af01620e7b323ab2d5a24a23439b02f402f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerinnerthemetcolorbox.sty \
texlive-beamertheme-tcolorbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
