SUMMARY = "Counter operations with label references"
DESCRIPTION = "Provides commands \\setcounterref and \\addtocounterref which use \
the section (or whatever) number from the reference as the \
value to put into the counter, as in: ...\\label{sec:foo} ... \
\\setcounterref{foonum}{sec:foo} Commands \\setcounterpageref and \
\\addtocounterpageref do the corresponding thing with the page \
reference of the label. No .ins file is distributed; process \
the .dtx with plain TeX to create one."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn53164"

RPM_NAME = "texlive-refcount-2023.201.3.6svn53164-53.1.noarch.rpm"
RPM_HASH = "f1d4b23e617a45e1137ff0aec158ae7a9c38967e9eb7ce2cab545cb897a28d1ceacfb84aa341c94332dd2de27c3731ebdfaffeda040de5bcd5d9c02b41a5abda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(refcount.sty) \
texlive-refcount"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(infwarerr.sty) \
tex(ltxcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
