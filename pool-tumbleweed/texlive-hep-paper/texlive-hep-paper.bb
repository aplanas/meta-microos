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

PV = "2023.201.2.1svn64917"

RPM_NAME = "texlive-hep-paper-2023.201.2.1svn64917-53.1.noarch.rpm"
RPM_HASH = "95a6fb91a7d11c63c5b6bfdd6d1fc95035e7e8dd650b594fbc075efb2bb49812d8a95890956450410f0d4fb35d966f475a6ff5b236d599717938675cf8ce98d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-paper.sty \
texlive-hep-paper"

RDEPENDS:${PN} += "/bin/sh \
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
