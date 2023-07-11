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

RPM_NAME = "texlive-refcount-2023.201.3.6svn53164-53.2.noarch.rpm"
RPM_HASH = "b7505780b70a28df33b11b2f9d427b6dd7085da2ca3ab59fff87317d4896a9d2346698a1ef0b673fe57d47ce676dc2523764b79b3b00650fa0323a0e27b7b1a4"
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
