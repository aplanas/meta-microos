SUMMARY = "A tool to manage anonymous work with BibLaTeX"
DESCRIPTION = "The package provides tools to help manage anonymous work with \
BibLaTeX. It will be useful, for example, in history or \
classical philology."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6.2svn48548"

RPM_NAME = "texlive-biblatex-anonymous-2023.209.2.6.2svn48548-54.1.noarch.rpm"
RPM_HASH = "b050ee570ec2262f8030b883ef8abbe9f9daebb34bd5504dcc38cf916639bbb1d8cb46ea7926ee2562d469fec62948f9fc85e6e30d756ea8f786acff77668b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-anonymous.sty \
texlive-biblatex-anonymous"

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
