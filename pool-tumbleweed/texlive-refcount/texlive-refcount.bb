SUMMARY = "Counter operations with label references"
DESCRIPTION = "Provides commands \\setcounterref and \\addtocounterref which use \
the section (or whatever) number from the reference as the \
value to put into the counter, as in: ...\\label{sec:foo} ... \
\\setcounterref{foonum}{sec:foo} Commands \\setcounterpageref and \
\\addtocounterpageref do the corresponding thing with the page \
reference of the label. No .ins file is distributed; process \
the .dtx with plain TeX to create one."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.6svn53164"

RPM_NAME = "texlive-refcount-2023.209.3.6svn53164-54.1.noarch.rpm"
RPM_HASH = "314ccd94778fcb2860de833b565015f5242a0bbd9eee82deffbf1d503e508bad81a24b3746e36a2460f2afb55610c3cdae59ecda161e455daf523c2518d0cc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcount.sty \
texlive-refcount"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
