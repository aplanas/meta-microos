SUMMARY = "Create tear-off stubs at the bottom of a page"
DESCRIPTION = "The \\stubs command creates as many repetitions as possible of \
its argument, at the bottom of the page; these stubs may be \
used (for example) for contact information."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1svn66204"

RPM_NAME = "texlive-stubs-2023.209.0.0.1.1svn66204-58.1.noarch.rpm"
RPM_HASH = "23436c720133ec55843d17c98227ab4f1e233a184705368a65d2d3ed3f281f96d606a1dbd4b6f444183019b60dade651868e834909156bf525f1b412c9e963a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-stubs.sty \
texlive-stubs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
