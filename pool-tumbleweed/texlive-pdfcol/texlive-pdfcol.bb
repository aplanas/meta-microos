SUMMARY = "Macros for maintaining colour stacks under pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports colour stacks. The driver \
file pdftex.def for package color defines and uses a main \
colour stack since version v0.04b. This package is intended for \
package writers. It defines macros for setting and maintaining \
new colour stacks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn64469"

RPM_NAME = "texlive-pdfcol-2023.209.1.7svn64469-52.1.noarch.rpm"
RPM_HASH = "8f8c85de0dcf61a407f39cfe69302cb32df44759847afa59c8f2cc2afe01bf18c8d1201699db1bc14fbaddddeb32c9831fbbae1b71058e0574e0dd57254c13de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcol.sty \
texlive-pdfcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
