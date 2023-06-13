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

PV = "2023.201.3.1svn54758"

RPM_NAME = "texlive-musical-2023.201.3.1svn54758-54.1.noarch.rpm"
RPM_HASH = "5ce8eeb142d03d9f71ca849c58b5c1883f71edca9ac98c0046a8616e94eff66906552036ab861c2a268b398b26f12170281b817a8098204115399e1ad080047d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(musical.sty) \
texlive-musical"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(footmisc.sty) \
tex(ifthen.sty) \
tex(tcolorbox.sty) \
tex(titlesec.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
