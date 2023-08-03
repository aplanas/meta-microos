SUMMARY = "Call epstopdf 'on the fly'"
DESCRIPTION = "The package adds support for EPS files in the graphicx package \
when running under pdfTeX. If an EPS graphic is detected, the \
package spawns a process to convert the EPS to PDF, using the \
script epstopdf. This of course requires that shell escape is \
enabled for the pdfTeX run."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-2023.209.2.11svn53546-54.1.noarch.rpm"
RPM_HASH = "a346eebdca4572f9fec0c84bcd65d3168657e0d3935287949e5bc5f3053cd24a11fac73c09febbf3ee81662cf9660994b78c756cdd3c43678188b6040792ac9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epstopdf-base.sty \
tex-epstopdf.sty \
texlive-epstopdf-pkg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-grfext.sty \
tex-infwarerr.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
