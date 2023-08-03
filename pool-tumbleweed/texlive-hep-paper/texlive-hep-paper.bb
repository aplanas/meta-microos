SUMMARY = "Publications in High Energy Physics"
DESCRIPTION = "This package aims to provide a single style file containing \
most configurations and macros necessary to write appealing \
publications in High Energy Physics. Instead of reinventing the \
wheel by introducing newly created macros, hep-paper preferably \
loads third party packages as long as they are light-weight \
enough. For usual publications it suffices to load the \
hep-paper package, without optional arguments, in addition to \
the article class."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64917"

RPM_NAME = "texlive-hep-paper-2023.209.2.1svn64917-54.1.noarch.rpm"
RPM_HASH = "eaf6c8d89b1bcd1c8dc45fdc83d38ea04dacacce20ed234895a3400b39be61d9d093e6739e6ff3fed47c111b40dc27833ec584095d4795e5a374a222f1e05111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-paper.sty \
texlive-hep-paper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-hep-acronym.sty \
tex-hep-bibliography.sty \
tex-hep-float.sty \
tex-hep-font.sty \
tex-hep-math-font.sty \
tex-hep-math.sty \
tex-hep-reference.sty \
tex-hep-text.sty \
tex-hep-title.sty \
tex-kvoptions.sty \
tex-parskip.sty \
tex-pdftexcmds.sty \
tex-ragged2e.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
