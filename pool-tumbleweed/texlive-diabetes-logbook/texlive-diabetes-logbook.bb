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

PV = "2023.201.svn54810"

RPM_NAME = "texlive-diabetes-logbook-2023.201.svn54810-52.1.noarch.rpm"
RPM_HASH = "c017b93275d7d661810ce0626bb4e46861301f029f7cbaf628ba80dd0eb2d81afb5e27f9118bce535544ed0d0412600e5c9e992770011e6d5ff765e3d8dc0616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dmlb.sty) \
texlive-diabetes-logbook"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(babel.sty) \
tex(bookmark.sty) \
tex(ellipsis.sty) \
tex(fontspec.sty) \
tex(pgf.sty) \
tex(pgfcalendar.sty) \
tex(pgfplots.sty) \
tex(pgfplotstable.sty) \
tex(polyglossia.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
