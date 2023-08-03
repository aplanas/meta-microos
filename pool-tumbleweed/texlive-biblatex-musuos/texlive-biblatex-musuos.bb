SUMMARY = "A BibLaTeX style for citations in musuos.cls"
DESCRIPTION = "The style is designed for use with the musuos class, but it \
should be usable with other classes, too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24097"

RPM_NAME = "texlive-biblatex-musuos-2023.209.1.0svn24097-54.1.noarch.rpm"
RPM_HASH = "912d7a6e8db687c652f699ce06672abf336c4dbee4343bc646f3690db62f45b30742207f961f6b383a01ba8e9111ede58e3a13393317a7cd7a5bdd66125acda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german-musuos.lbx \
tex-musuos.bbx \
tex-musuos.cbx \
texlive-biblatex-musuos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-verbose-ibid.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
