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

PV = "2023.208.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-2023.208.0.0.3svn23379-53.1.noarch.rpm"
RPM_HASH = "78ce329b9833fd6d07ae585ceb1c9bfb98db79fa04a9a02cf0ec2882e1560f211119760c1f4da8bbbcefb8c3f1d78de7c37a53e5d23e45a97b3f638641e422a4"
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
