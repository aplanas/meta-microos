SUMMARY = "John Cleese's Silly Walk as page numbering style"
DESCRIPTION = "This simple LaTeX package provides John Cleese's iconic silly \
walk routine as a page numbering style. Other counters, as well \
as integers, can be typeset in this 'silly' style, too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn66349"

RPM_NAME = "texlive-sillypage-2023.209.1.6svn66349-54.1.noarch.rpm"
RPM_HASH = "7738556c93d19197d223ddbbaaf76d60dc2c173975fbaed3123f0f77f596ec115f02005a5afa59f4960eaf5294a64a8f0be4570a1d0f811dd243687875f5d843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sillypage.sty \
texlive-sillypage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
