SUMMARY = "Typeset (musical) theatre scripts"
DESCRIPTION = "This package is designed to simplify the development and \
distribution of scripts for theatrical musicals, especially \
ones under development. The output is formatted to follow \
generally accepted script style[1] while also maintaining a \
high level of typographic integrity, and includes commands for \
dialog, lyrics, stage directions, music and dance cues, \
rehearsal marks, and more. It gracefully handles dialog that \
crosses page breaks, and can generate lists of songs and lists \
of dances in the show. [1] There are lots of references for the \
One True Way to format a script. Naturally, none of them agree."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn54758"

RPM_NAME = "texlive-musical-2023.209.3.1svn54758-55.1.noarch.rpm"
RPM_HASH = "3b0a52ca9fe2c452c7bde5f970042a5022ce7e1206faba11a4edae717e67dba2b531761f50f0ae8bfb2e4eeaccde3b6cb7003cf6f570c112f74a51d41f990fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musical.sty \
texlive-musical"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-ifthen.sty \
tex-tcolorbox.sty \
tex-titlesec.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
