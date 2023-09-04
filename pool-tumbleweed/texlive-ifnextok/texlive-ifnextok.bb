SUMMARY = "Utility macro: peek ahead without ignoring spaces"
DESCRIPTION = "The package deals with the behaviour of the LaTeX internal \
command \\@ifnextchar, which skips blank spaces. This has the \
potential to surprise users, since it can produce really \
unwanted effects. A common example occurs with brackets \
starting a line following \\\\: the command looks for an optional \
argument, whereas the user wants the brackets to be printed. \
The package offers commands and options for modifying this \
behaviour, maybe limited to certain parts of the document \
source."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-2023.209.0.0.3svn23379-54.1.noarch.rpm"
RPM_HASH = "0eefb06c4fba9e5641227a25a839a3e758363e0259bd59c14d6a30b464c034cfea4aa8ef0d211d4cf0e3d8923f3bcfb65b0ba032d3b3e65a097076c9a63d1184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifnextok.sty \
texlive-ifnextok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
