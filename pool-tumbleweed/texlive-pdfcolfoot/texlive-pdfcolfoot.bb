SUMMARY = "Separate color stack for footnotes with pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports several colour stacks. This \
package uses a separate colour stack for footnotes that can \
break across pages. The package is part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65512"

RPM_NAME = "texlive-pdfcolfoot-2023.209.1.4svn65512-52.1.noarch.rpm"
RPM_HASH = "ef90b16adb6bf59c493d60329867420eee43377f8cc61a644271cf6793732e8c30d1609b8e42c5c649cde5d762eb04eb946ab87b34cf04227ead25440ef4b5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcolfoot.sty \
texlive-pdfcolfoot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdfcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
