SUMMARY = "Framed minipages of a specified total width (text and frame combined)"
DESCRIPTION = "The package essentially just wraps a minipage within an \\fbox. \
However, while \
\\fbox{\\begin{minipage}{\\linewidth}...\\end{minipage}} juts out \
into the margin, \\begin{boxedminipage}...\\end{boxedminipage} \
does not. Instead, it subtracts the frame's dimensions from the \
specified dimensions of the minipage before typesetting the \
minipage. Note: The package was formerly known as \
boxedminipage2e and now replaces Mario Wolczko's earlier \
boxedminipage package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54827"

RPM_NAME = "texlive-boxedminipage-2023.209.1.1svn54827-53.1.noarch.rpm"
RPM_HASH = "80f182776aae194d22bb32be960783801ae711ea30e6047a1fc31709d7ec701ddcfd5fa6fac8a5cf069e07c9e9f382039927ae60847ec4dd14e7bc05ca8e4b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxedminipage.sty \
tex-boxedminipage2e.sty \
texlive-boxedminipage"

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
