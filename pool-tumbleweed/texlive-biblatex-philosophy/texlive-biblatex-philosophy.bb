SUMMARY = "Styles for using BibLaTeX for work in philosophy"
DESCRIPTION = "The bundle offers two styles - philosophy-classic and \
philosophy-modern - that facilitate the production of two \
different kinds of bibliography, based on the authoryear style, \
with options and features to manage the information about the \
translation of foreign texts or their reprints. Though the \
package's default settings are based on the conventions used in \
Italian publications, these styles can be used with every \
language recognized by babel, possibly with some simple \
redefinitions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.8gsvn64414"

RPM_NAME = "texlive-biblatex-philosophy-2023.209.1.9.8gsvn64414-54.1.noarch.rpm"
RPM_HASH = "78143e59d158aa588470a9059758d6b432017dd37cc6d55aa90179a504cf50f2f699cb5402f20827cddfea08d7be4576f3a79c675c7162dd85bc8b9c0a7847bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-philosophy.lbx \
tex-french-philosophy.lbx \
tex-italian-philosophy.lbx \
tex-philosophy-classic.bbx \
tex-philosophy-classic.cbx \
tex-philosophy-modern.bbx \
tex-philosophy-modern.cbx \
tex-philosophy-standard.bbx \
tex-philosophy-verbose.bbx \
tex-philosophy-verbose.cbx \
tex-spanish-philosophy.lbx \
texlive-biblatex-philosophy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authortitle.bbx \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-standard.bbx \
tex-verbose-trad2.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
