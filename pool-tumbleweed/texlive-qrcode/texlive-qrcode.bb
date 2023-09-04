SUMMARY = "Generate QR codes in LaTeX"
DESCRIPTION = "The package generates QR (Quick Response) codes in LaTeX, \
without the need for PSTricks or any other graphical package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.51svn36065"

RPM_NAME = "texlive-qrcode-2023.209.1.51svn36065-54.2.noarch.rpm"
RPM_HASH = "715ba3f459a9f30e09c3ab18fc2ab592bb940249df3341994cab629ace5302f981aa686993727ba4e32428b4104ba6f3d3b469ddd9ccea5f48fe9dc06630695c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qrcode.sty \
texlive-qrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
