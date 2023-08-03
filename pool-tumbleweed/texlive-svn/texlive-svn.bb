SUMMARY = "Typeset Subversion keywords"
DESCRIPTION = "The svn package lets you typeset (in LaTeX) the value of \
Subversion keywords. It is approximately an equivalent to the \
rcs package, but for Subversion rather than CVS. Details of \
Subversion (a replacement for CVS) is available from the \
project's home site."
LICENSE = "LPPL-1.0"

PV = "2023.209.43svn15878"

RPM_NAME = "texlive-svn-2023.209.43svn15878-58.1.noarch.rpm"
RPM_HASH = "aeb16ee01a8472cdf564458e7e7cb89ffc8b0d9e3bb9cd05546588f56cc5f03282dacef41cb50c969a7f9a033a5d2d6b32b06e3cbfc052916a09df69aeadfff3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn.sty \
texlive-svn"

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
