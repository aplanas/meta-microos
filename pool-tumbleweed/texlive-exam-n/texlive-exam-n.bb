SUMMARY = "Exam class, focused on collaborative authoring"
DESCRIPTION = "The class design offers: Direct support for collaborative \
development of an exam, using a model in which a departmental \
'exams convener' or 'exam chair' coordinates multiple authors \
writing individual questions (the class file and associated \
process is in regular use within a physics and astronomy \
department). All of the 'traditional' exam paper features such \
as sectioning, per-part running marks, 'Question n continued' \
catchwords, and so on. Readily configured local adaptation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-2023.209.1.4.0svn64674-53.1.noarch.rpm"
RPM_HASH = "89369b7434b15415208b13032af5727660b2ff5689ce2624d076c601d70b8eaa2d0de297987161039ed9e6014f68381bcded3f7dc0b97126ca0800823a0cf67b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-n.cls \
texlive-exam-n"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-helvet.sty \
tex-mathptm.sty \
tex-siunitx.sty \
tex-stix2.sty \
tex-textcomp.sty \
tex-times.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
