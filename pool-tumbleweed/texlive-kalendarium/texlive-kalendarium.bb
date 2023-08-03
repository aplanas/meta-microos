SUMMARY = "Print dates according to the classical Latin calendar"
DESCRIPTION = "kalendarium is a LaTeX3 package that provides several macros \
with which to print dates in classical Latin given days on the \
Julian or Gregorian calendars, using the same syntax used by \
ancient Roman authors. The format of these dates may be \
customised either in the package options or on a per-command \
basis; these options also allow for the generation of date \
strings according to different eras of the Classical period."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn48744"

RPM_NAME = "texlive-kalendarium-2023.209.1.0svn48744-56.1.noarch.rpm"
RPM_HASH = "020099b8aae1c6a78e0fade7a4c96ce047b19b5ccdce9cb6f6a2e92bdd8761ddc87be225615b254336c81fd859949935fd663f6aa6ceb32f26d6b2fa18a1ae3e"
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
