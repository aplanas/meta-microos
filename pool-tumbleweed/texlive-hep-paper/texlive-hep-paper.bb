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

RPM_NAME = "texlive-hep-paper-2023.201.2.1svn64917-53.2.noarch.rpm"
RPM_HASH = "e4d4af85f555e2a09c7c3840aea82515a1eb0cbf48606ad691f43b45171257aabe88bce09bb4daed2e5ab35b14bef0beecd0c8689e5be67f7ac191b0a33296c4"
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
