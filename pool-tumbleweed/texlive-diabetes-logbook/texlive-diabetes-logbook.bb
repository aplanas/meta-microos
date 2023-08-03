SUMMARY = "A logbook for people with type one diabetes"
DESCRIPTION = "Initally a logbook for me, a person with type one diabetes \
mellitus, this evolved over time into a TeX project, making it \
prettier and/or easier to use. I've made it simple to use, \
while not forgoing the document's beauty or the speed of input. \
The logbook, with slight commenting out and editing, could be \
used as a journal by anybody, although the template and \
graphing functionality are set up for people using insulin \
injections and blood glucose teststrips, as well as \
counting/estimating carbs, protein, and fat. Note: The names of \
the package's files are not constructed using the long \
'diabetes-logbook', but the acronym 'dmlb' (for 'diabetes \
mellitus log book')."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54810"

RPM_NAME = "texlive-diabetes-logbook-2023.209.svn54810-53.1.noarch.rpm"
RPM_HASH = "cad7c44180c22bb73e3e557eab985d3138e982f19f2879ea7c893b6e6f75a6c19682c671ba3346169cce89da78ed3c480d8a44befb3fa68d6e24f359de693fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dmlb.sty \
texlive-diabetes-logbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-ellipsis.sty \
tex-fontspec.sty \
tex-pgf.sty \
tex-pgfcalendar.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-polyglossia.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
