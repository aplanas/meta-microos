SUMMARY = "Enhanced theorem environment"
DESCRIPTION = "The package offers enhancements for theorem-like environments: \
easier control of layout; proper placement of endmarks even \
when the environment ends with \\end{enumerate} or \
\\end{displaymath} (including support for amsmath \
displayed-equation environments); and support for making a list \
of theorems, analagous to \\listoffigures."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.33svn27609"

RPM_NAME = "texlive-ntheorem-2023.201.1.33svn27609-54.1.noarch.rpm"
RPM_HASH = "7663e02b4701b337769ef7dd50fdebbe76045d37dacb749393481a113732677526feb53e4838e2e3689758119f4aaf899ed3df0d51034a4bc0abd45006ef95e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ntheorem.sty \
texlive-ntheorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
