SUMMARY = "A beamer inner theme which reproduces standard beamer blocks using tcolorboxes"
DESCRIPTION = "This package provides an inner theme for beamer which \
reproduces standard beamer blocks using tcolorboxes. The look \
and feel (rounded/sharp corners, shadows and colours) will \
automatically adapt to which other themes are loaded."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64387"

RPM_NAME = "texlive-beamertheme-tcolorbox-2023.209.0.0.5svn64387-54.1.noarch.rpm"
RPM_HASH = "95153db5ba076ebd9f80836ad38b6620b9ba19e6828328f38e1f7c6debbd6f50d64491d11fc862cb25a47041befc56d432344e51fc22654a050a7358ee520ee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerinnerthemetcolorbox.sty \
texlive-beamertheme-tcolorbox"

RDEPENDS:${PN} += "/usr/bin/sh \
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
