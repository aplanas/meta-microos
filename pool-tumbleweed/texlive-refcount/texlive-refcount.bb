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

RPM_NAME = "texlive-refcount-2023.209.3.6svn53164-54.2.noarch.rpm"
RPM_HASH = "e60e0bccfe19955a4a6b8f3ad1f23b432541a9f9a0d3170306ce5a21a136d6d47a14dc9639755b0aee5292dd7285df071e59b2b7036fb0ced7192afcacee48b0"
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
