SUMMARY = "Print dates according to the classical Latin calendar"
DESCRIPTION = "kalendarium is a LaTeX3 package that provides several macros \
with which to print dates in classical Latin given days on the \
Julian or Gregorian calendars, using the same syntax used by \
ancient Roman authors. The format of these dates may be \
customised either in the package options or on a per-command \
basis; these options also allow for the generation of date \
strings according to different eras of the Classical period."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48744"

RPM_NAME = "texlive-kalendarium-2023.201.1.0svn48744-55.1.noarch.rpm"
RPM_HASH = "d019f792fbc617479593669817f90f710529d68496bb38c4486c69e8af9f9668e472555e811a63b3872782fe423274a27a86a9a561d201787836eff1abe64a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kalendarium.sty \
texlive-kalendarium"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
