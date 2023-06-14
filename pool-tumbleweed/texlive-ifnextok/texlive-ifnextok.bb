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

PV = "2023.201.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-2023.201.0.0.3svn23379-52.1.noarch.rpm"
RPM_HASH = "ffe64c3b6c3a77e3a23430448ebb609dfa1e349a2b282a967b08b12c1d3330852b7001ba87fa9b30a89c39e787c8b1bb209c6a6d69f9511872d0094821f826fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifnextok.sty \
texlive-ifnextok"

RDEPENDS:${PN} += "/bin/sh \
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
