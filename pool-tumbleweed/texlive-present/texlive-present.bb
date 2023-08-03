SUMMARY = "Presentations with Plain TeX"
DESCRIPTION = "The package offers a collection of simple macros for preparing \
presentations in Plain TeX. Slide colour and text colour may be \
set, links between parts of the presentation, to other files, \
and to web addresses may be inserted. Images may be included \
easily, and code is available to provide transition effects \
between slides or frames. The structure of the macros is not \
overly complex, so that users should find it easy to adapt the \
macros to their specific needs."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.1svn50048"

RPM_NAME = "texlive-present-2023.209.2.2.1svn50048-53.1.noarch.rpm"
RPM_HASH = "bd3af9435af464b87c23346d54b815346fad89f17f6f160ee916b5fa25b440ef400dbfa2977647181a6511f33f36b72bd1a415fed8c9caf7ce333d7c3e6f0c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-present.tex \
texlive-present"

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
