SUMMARY = "Linguistic tools"
DESCRIPTION = "Provides an environment for linguistic examples, tools for \
glosses, and various other goodies. The code was developed from \
the midnight and covington packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19216"

RPM_NAME = "texlive-gb4e-2023.209.svn19216-53.1.noarch.rpm"
RPM_HASH = "2f12994663deacd4d97fb1dd00bf484395c40af76200c138eff8039b0d75ee23feb48340155a94e28221a33670f1fb6774b351860761cb83c8cd8dfb16a008b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cgloss4e.sty \
tex-gb4e.sty \
texlive-gb4e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
