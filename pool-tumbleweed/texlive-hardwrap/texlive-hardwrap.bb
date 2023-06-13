SUMMARY = "Hard wrap text to a certain character length"
DESCRIPTION = "The package facilitates wrapping text to a specific character \
width, breaking lines by words rather than, as done by TeX, by \
characters. The primary use for these facilities is to aid the \
generation of messages sent to the log file or console output \
to display messages to the user. Package authors may also find \
this useful when writing out arbitary text to an external file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-2023.201.0.0.2svn21396-53.1.noarch.rpm"
RPM_HASH = "ed9c890949af1d2e886b60091e8e853d9ee2eb928009a2f81e22b146043da0ae6ed2973223aebfeb30fc52acc5ea4c2d12b72d3a0c5dabd43bdb9c22263446f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hardwrap.sty) \
texlive-hardwrap"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifplatform.sty) \
tex(ifxetex.sty) \
tex(pdftexcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
