SUMMARY = "Support of Qualitative Data Analysis"
DESCRIPTION = "The package is for use in Qualitative Data Analysis research. \
It supports the integration of Qualitative Data Analysis (QDA) \
research tasks, specifically for Grounded Theory, into the \
LaTeX work flow. It assists in the analysis of textual data \
such as interview transcripts and field notes by providing the \
LaTeX user with macros which are used to markup textual \
information -- for example, in-depth interviews."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn26313"

RPM_NAME = "texlive-ulqda-2023.201.1.1svn26313-53.1.noarch.rpm"
RPM_HASH = "a7b6f75e2ec3895dda82bca1a83ebe8be0fc84a222020df6fbc85ced9723d2b99fb52328344450520871177a8660c6f4ed9793b3e70fc2692ffbe9c7c66ab4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ulqda.sty \
texlive-ulqda"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
