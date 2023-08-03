SUMMARY = "Hard wrap text to a certain character length"
DESCRIPTION = "The package facilitates wrapping text to a specific character \
width, breaking lines by words rather than, as done by TeX, by \
characters. The primary use for these facilities is to aid the \
generation of messages sent to the log file or console output \
to display messages to the user. Package authors may also find \
this useful when writing out arbitary text to an external file."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-2023.209.0.0.2svn21396-54.1.noarch.rpm"
RPM_HASH = "84857b48d995aa146a5f245750c1e78bb83e894240450992e0a4762a8861a7f2866a693ea7632cfd177a530f655ef56bf66d727ae0cbc31f60eead50718921d0"
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
