SUMMARY = "Use Computer Modern bold Caps and Small-caps in ConTeXt"
DESCRIPTION = "The module makes provision for bold caps and small caps CM \
fonts, in ConTeXt. Such a font may be found in the Computer \
Modern 'extra bold' font set."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cmscbf-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "c393b4f64db694ad959c6edbc23fc867a22ee544ce50044ab4c8f6cb6bb99781c92e4390844d47a7ba9fdf480ca7bf5048bbbe0df7f79770e5bcfabfd604714a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-cmscbf.tex \
texlive-context-cmscbf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
