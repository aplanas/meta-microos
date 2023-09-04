SUMMARY = "Call epstopdf 'on the fly'"
DESCRIPTION = "The package adds support for EPS files in the graphicx package \
when running under pdfTeX. If an EPS graphic is detected, the \
package spawns a process to convert the EPS to PDF, using the \
script epstopdf. This of course requires that shell escape is \
enabled for the pdfTeX run."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-2023.209.2.11svn53546-54.2.noarch.rpm"
RPM_HASH = "9f9ef2cc538606b7d259bd0c137d26803e3d390fff68ded27ac5fec9b6273adf0eba37af66cd286c344dca2fefb22de8a64133be723c28bab7a330d21e8dc641"
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
