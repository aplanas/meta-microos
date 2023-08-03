SUMMARY = "Makes the style and command of moderncv (style classic) available for koma-classes and thus compatible with BibLaTeX"
DESCRIPTION = "This package provides an imitation of the moderncv class with \
the classic style (by Xavier Danaux), to be used in conjunction \
with the koma-classes. Thus it is possible to configure \
pagelayout, headings etc. the way it is done in koma-classes. \
Moreover, it is possible to use BibLaTeX, while the original \
moderncv-class is incompatible with BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn25025"

RPM_NAME = "texlive-koma-moderncvclassic-2023.209.0.0.5svn25025-56.1.noarch.rpm"
RPM_HASH = "00154d60464cc184301a5718f86911446cd24c9784ed4548672a7aad4229a7a5fa88cbe94647c9755cfd2840091ad08bdd7d349a6e868f9bf0a1a088a3531888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-koma-moderncvclassic.sty \
texlive-koma-moderncvclassic"

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
