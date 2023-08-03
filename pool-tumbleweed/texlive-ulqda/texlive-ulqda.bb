SUMMARY = "Support of Qualitative Data Analysis"
DESCRIPTION = "The package is for use in Qualitative Data Analysis research. \
It supports the integration of Qualitative Data Analysis (QDA) \
research tasks, specifically for Grounded Theory, into the \
LaTeX work flow. It assists in the analysis of textual data \
such as interview transcripts and field notes by providing the \
LaTeX user with macros which are used to markup textual \
information -- for example, in-depth interviews."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn26313"

RPM_NAME = "texlive-ulqda-2023.209.1.1svn26313-54.1.noarch.rpm"
RPM_HASH = "85e76cb7a49fcd62ea81db6e91795b554f168ea43cf7bdf6bc83063ad70f5bdf658aa536ceecffc9c9e55323205781457e9b469a7da53e948ec26628a7f183fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulqda.sty \
texlive-ulqda"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Digest--SHA1 \
perl-Getopt--Long \
sed \
tex-dot2texi.sty \
tex-multicol.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulqda-bin"

inherit rpm
