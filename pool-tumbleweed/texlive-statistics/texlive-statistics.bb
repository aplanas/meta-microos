SUMMARY = "Compute and typeset statistics tables and graphics"
DESCRIPTION = "The 'statistics' package can compute and typeset statistics \
like frequency tables, cumulative distribution functions \
(increasing or decreasing, in frequency or absolute count \
domain), from the counts of individual values, or ranges, or \
even the raw value list with repetitions. It can also compute \
and draw a bar diagram in case of individual values, or, when \
the data repartition is known from ranges, an histogram or the \
continuous cumulative distribution function. You can ask \
'statistics' to display no result, selective results or all of \
them. Similarly 'statistics' can draw only some parts of the \
graphs. Every part of the generated tables or graphics is \
customizable."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.2svn52212"

RPM_NAME = "texlive-statistics-2023.201.2.2svn52212-57.1.noarch.rpm"
RPM_HASH = "0deb4df728d462e633797e9422609411db2677e0352796f28421b89f20781a0ec3ae68d06fdf39988a572c9ff30944f3a5b1e4a4c09b1118a54df2ae626bd09d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statistics.sty \
texlive-statistics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
