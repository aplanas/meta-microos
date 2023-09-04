SUMMARY = "Hard wrap text to a certain character length"
DESCRIPTION = "The package facilitates wrapping text to a specific character \
width, breaking lines by words rather than, as done by TeX, by \
characters. The primary use for these facilities is to aid the \
generation of messages sent to the log file or console output \
to display messages to the user. Package authors may also find \
this useful when writing out arbitary text to an external file."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-2023.209.0.0.2svn21396-54.2.noarch.rpm"
RPM_HASH = "825a2937b933edc5488fe00015d7f2ccd473c733e4e0ee98ce339298843b368290e8b56cb618285cecd9f763ee7a029fcdced6aec0f5257d327e4b0028f3b269"
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
