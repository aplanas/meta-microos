SUMMARY = "A wrapper for article with macros and customizations for computer science assignments"
DESCRIPTION = "This class wraps the default article and extends it for a \
homogeneous look of hand-in assignments at university (RWTH \
Aachen University, Computer Science Department), specifically \
in the field of computer science, but easily extensible to \
other fields. It provides macros for structuring exercises, \
aggregating points, and displaying a grading table, as well as \
several macros for easier math mode usage."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn63992"

RPM_NAME = "texlive-csassignments-2023.209.1.0.2svn63992-55.1.noarch.rpm"
RPM_HASH = "5101970fa570e8691f4306f81157701d273f523e899ab6ff4180c5966bf722677ec5892a8246ec8d564786c9d0a1e09b50361ce99fb4144ef00e5b1ec4b95753"
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
