SUMMARY = "A wall calendar class with custom layouts"
DESCRIPTION = "This package provides a wall calendar class with custom layouts \
and support for internationalization. It comes with the \
following layouts: Full page photo, the calendar days overlaid \
with opacity Full page photo, the photo above the calendar days \
Small landscape photo, with a calendar grid Year planner \
Thumbnails and captions Varnish mask There is also support for \
loading event marks from a CSV file."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn45568"

RPM_NAME = "texlive-wallcalendar-2023.209.1.3.1svn45568-54.1.noarch.rpm"
RPM_HASH = "ea56e516998af837cc6e575ea3dd80c139500dd47a92d7d1921614c47f8fe7019ea48ec6db0400ee201d8dfa5a62c919c568cd6ba8ae1746a8989ef4e46cc913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wallcalendar-czech.tex \
tex-wallcalendar-dutch.tex \
tex-wallcalendar-english.tex \
tex-wallcalendar-french.tex \
tex-wallcalendar-german.tex \
tex-wallcalendar-hungarian.tex \
tex-wallcalendar-italian.tex \
tex-wallcalendar-japanese.tex \
tex-wallcalendar-norwegian.tex \
tex-wallcalendar-portuguese.tex \
tex-wallcalendar-romanian.tex \
tex-wallcalendar-serbian.tex \
tex-wallcalendar-slovakian.tex \
tex-wallcalendar-slovenian.tex \
tex-wallcalendar-spanish.tex \
tex-wallcalendar-swedish.tex \
tex-wallcalendar-thai.tex \
tex-wallcalendar.cls \
texlive-wallcalendar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-calc.sty \
tex-ccicons.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-luacode.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-multicol.sty \
tex-nag.sty \
tex-pdftexcmds.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-wasysym.sty \
tex-xcoffins.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
