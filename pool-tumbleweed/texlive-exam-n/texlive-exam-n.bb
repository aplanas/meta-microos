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

PV = "2023.201.1.4.0svn64674"

RPM_NAME = "texlive-exam-n-2023.201.1.4.0svn64674-52.1.noarch.rpm"
RPM_HASH = "431809e76fcc9289d763908887e399dd4dfca3782cba9359f52f976a3b786158ca44be2725d3ace41b73db3f12e25871646b99214db77fd423887734380cb00c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exam-n.cls \
texlive-exam-n"

RDEPENDS:${PN} += "/bin/sh \
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
