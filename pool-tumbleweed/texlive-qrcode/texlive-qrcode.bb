SUMMARY = "Generate QR codes in LaTeX"
DESCRIPTION = "The package generates QR (Quick Response) codes in LaTeX, \
without the need for PSTricks or any other graphical package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.51svn36065"

RPM_NAME = "texlive-qrcode-2023.201.1.51svn36065-53.1.noarch.rpm"
RPM_HASH = "e5d6320eb3e4828629bc37d3aa63cfa57b6e1dda385e9681bc7ba0767be52058251d268c36226c6a7c569e755f4e4a405eefea62ac9763ed0d7ee4ddc464e2cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(qrcode.sty) \
texlive-qrcode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
