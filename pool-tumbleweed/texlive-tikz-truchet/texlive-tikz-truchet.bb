SUMMARY = "Draw Truchet tiles"
DESCRIPTION = "This is a package for LaTeX that draws Truchet tiles, as used \
in Colin Beveridge's article Too good to be Truchet in issue 08 \
of Chalkdust."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn50020"

RPM_NAME = "texlive-tikz-truchet-2023.201.svn50020-52.1.noarch.rpm"
RPM_HASH = "1a08f1ab8a648f2af8b10e55dbbcfa2aba42ee74e07267f3795ddd88bc3a6fb4f672e5ac782164ece4de07558f46f731b86d95cc77aa1ab927cb8c3b0d66b602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-truchet.sty) \
texlive-tikz-truchet"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
