SUMMARY = "Drawing interference patterns with PGF/TikZ"
DESCRIPTION = "This LaTeX package makes it possible to simulate interference \
patterns occuring on a screen if monochromatic light is \
diffracted at regular structures of slits. It makes use of the \
PGF/TikZ graphics package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn61562"

RPM_NAME = "texlive-pgf-interference-2023.209.0.0.1svn61562-52.1.noarch.rpm"
RPM_HASH = "3cde59d513f020b51d8348f8baec6280c6d1bac9fe5e2c53ff5b406faef8f0b562e7d7a787597dc5992c3e285cef2153bdc85a8d3cf859f36904de872b8b751c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-interference.sty \
texlive-pgf-interference"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
