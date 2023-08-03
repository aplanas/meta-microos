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

PV = "2023.209.2.2svn52212"

RPM_NAME = "texlive-statistics-2023.209.2.2svn52212-58.1.noarch.rpm"
RPM_HASH = "250844b36ba526bd3536ccd41b6fb684c6bbb9a11ea2afd280c906f044a5b878dfab4de3ef6a1909eb9a97af53d8ac8c5ea93c9bea526d82a6b846b1a0d00118"
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
