SUMMARY = "A wrapper for article with macros and customizations for computer science assignments"
DESCRIPTION = "This class wraps the default article and extends it for a \
homogeneous look of hand-in assignments at university (RWTH \
Aachen University, Computer Science Department), specifically \
in the field of computer science, but easily extensible to \
other fields. It provides macros for structuring exercises, \
aggregating points, and displaying a grading table, as well as \
several macros for easier math mode usage."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0.2svn63992"

RPM_NAME = "texlive-csassignments-2023.204.1.0.2svn63992-54.1.noarch.rpm"
RPM_HASH = "e1c959f8bae1eef23feee6dd0e1a48bd6eb70e761cb9522a5f01c42b90467be456c9156bdf7168b50e6ea17a1db9f85c37955c97ba629cfd6f9fd7c8ee4e1f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csassignments.cls \
texlive-csassignments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-changepage.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-pdfpages.sty \
tex-stmaryrd.sty \
tex-suffix.sty \
tex-tgpagella.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-totcount.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
