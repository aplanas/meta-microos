SUMMARY = "Graphical/textual representations of swimming performances"
DESCRIPTION = "The package provides two macros that produce representations of \
a swimmer's performances. The user records data in a text file \
and specifies as arguments of the macros the date range of \
interest. The macros extract the relevant information from the \
file and process it: \\swimgraph produces a graph of the times \
in a single swimming event (specified as an argument), plotting \
long course and short course times in separate lines. Records \
and qualifying times, stored in text files, may optionally be \
included on the graph. \\swimtext produces a written record of \
the times in all events. Files of current world and Canadian \
records are included. The package requires the PSTricks and \
keyval packages. For attractive output it also requires a \
colour output device."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25446"

RPM_NAME = "texlive-swimgraf-2023.201.svn25446-57.1.noarch.rpm"
RPM_HASH = "6009ea464ce079735d8af546aadbf49cd3bd4b057ba1cf990e2462d4eaa8d50cda3d12c78a14aeba804cff60ea8772f1f4cff94ea71bc192591dab43a3e44f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-swimgraf.cfg \
tex-swimgraf.sty \
texlive-swimgraf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-mathpazo.sty \
tex-pst-plot.sty \
tex-pstcol.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
