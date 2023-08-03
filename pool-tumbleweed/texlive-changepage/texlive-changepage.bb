SUMMARY = "Margin adjustment and detection of odd/even pages"
DESCRIPTION = "The package provides commands to change the page layout in the \
middle of a document, and to robustly check for typesetting on \
odd or even pages. Instructions for use are at the end of the \
file. The package is an extraction of code from the memoir \
class, whose user interface it shares. It is intended the this \
package will eventually replace the chngpage package, which is \
distributed with the package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-changepage-2023.209.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "0de1c82bf2f452d6838e44246ee998ea15d93d3f3029101722ea2f3d0695887bfdad3d3acce1ac240a6d8f8f6d3f6ed104b3702534b1b4a4aee825cb01ac4f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changepage.sty \
tex-chngpage.sty \
texlive-changepage"

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
