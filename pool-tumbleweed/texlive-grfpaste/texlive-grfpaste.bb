SUMMARY = "Include fragments of a dvi file"
DESCRIPTION = "Provides a mechanism to include fragments of dvi files with the \
graphicx package, so that you can use \\includegraphics to \
include dvi files. The package requires the dvipaste program."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17354"

RPM_NAME = "texlive-grfpaste-2023.209.0.0.2svn17354-54.1.noarch.rpm"
RPM_HASH = "de1a8284ef929e3fff2204a229b973529eeb100c606fb6dc776bd12128b54fc636cd92440e7351198a7d5d27e7149996bee11ddf4cc1451372d25a5c066adecb"
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
