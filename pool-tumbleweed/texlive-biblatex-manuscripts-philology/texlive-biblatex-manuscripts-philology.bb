SUMMARY = "Manage classical manuscripts with BibLaTeX"
DESCRIPTION = "The package adds a new entry type: @manuscript to manage \
manuscript in classical philology, for example to prepare a \
critical edition."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.2svn53344"

RPM_NAME = "texlive-biblatex-manuscripts-philology-2023.209.2.1.2svn53344-54.1.noarch.rpm"
RPM_HASH = "610a352a5e331b8ce2a777dda2582727e30c160ef4e188291b17d013d90e926c3843c446b2aa49b72633494f7dd004ba958483a1efc29bd24ba2f84b1dc6e03f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-manuscripts.lbx \
tex-french-manuscripts.lbx \
tex-italian-manuscripts.lbx \
tex-manuscripts-NewBibliographyString.sty \
tex-manuscripts-noautoshorthand.bbx \
tex-manuscripts-shared.bbx \
tex-manuscripts.bbx \
texlive-biblatex-manuscripts-philology"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-italian.lbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
