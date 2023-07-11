SUMMARY = "Hard wrap text to a certain character length"
DESCRIPTION = "The package facilitates wrapping text to a specific character \
width, breaking lines by words rather than, as done by TeX, by \
characters. The primary use for these facilities is to aid the \
generation of messages sent to the log file or console output \
to display messages to the user. Package authors may also find \
this useful when writing out arbitary text to an external file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-2023.201.0.0.2svn21396-53.2.noarch.rpm"
RPM_HASH = "19a73eb29048f09dcb478e8ad8492576cf417594f0ec8bae6902eacc51651a651b5d2b782c2636aecefc601bfc8063246509bcf1ff0af17d13d96b854e839116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hardwrap.sty \
texlive-hardwrap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifplatform.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
