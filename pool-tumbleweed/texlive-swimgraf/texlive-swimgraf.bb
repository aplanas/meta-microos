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

PV = "2023.209.svn25446"

RPM_NAME = "texlive-swimgraf-2023.209.svn25446-58.1.noarch.rpm"
RPM_HASH = "db4c61a66fa20c7fb22961c92551c757161d1fae4f6e953d6b65556389204001d18e52b1c3069625c062b6ae3a12c6438a5da902f10e2f52c86fa94a74b2b87b"
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
