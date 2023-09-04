SUMMARY = "Include fragments of a dvi file"
DESCRIPTION = "Provides a mechanism to include fragments of dvi files with the \
graphicx package, so that you can use \\includegraphics to \
include dvi files. The package requires the dvipaste program."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-2023.209.0.0.2svn17354-54.2.noarch.rpm"
RPM_HASH = "3ae9dd88f8205240b60bfc0946ccb16d5a3065506b965352052c9c26f03ccf818312221bfc0737ad53791400663222103bf2ccf9977fad8ea3c9d891390104e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfpaste.sty \
texlive-grfpaste"

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
