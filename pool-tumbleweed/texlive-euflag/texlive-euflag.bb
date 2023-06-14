SUMMARY = "A command to reproduce the flag of the European Union"
DESCRIPTION = "This LaTeX package implements a command to reproduce the \
official flag of the European Union (EU). The flag is \
reproduced at 1em high based on the current font size, so it \
can be scaled arbitrarily by changing the font size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn55265"

RPM_NAME = "texlive-euflag-2023.201.0.0.8svn55265-52.1.noarch.rpm"
RPM_HASH = "a2cd4b3bf9b2ba6b6635b1d6f8a6379e49c35e6b811a76ecfa064c662783429480b333f81079a87816c527035a13bac93f86ed986b398fce9714204da2029ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euflag.sty \
texlive-euflag"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
