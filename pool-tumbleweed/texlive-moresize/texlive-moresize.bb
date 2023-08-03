SUMMARY = "Allows font sizes up to 35.83pt"
DESCRIPTION = "A package for using font sizes up to 35.88pt, for example with \
the EC fonts. New commands \\HUGE and \\ssmall for selecting font \
sizes are provided together with some options working around \
current LaTeX2e shortcomings in using big font sizes. The \
package also provides options for improving the typesetting of \
paragraphs (or headlines) with embedded math expressions at \
font sizes above 17.28pt."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9svn17513"

RPM_NAME = "texlive-moresize-2023.209.1.9svn17513-55.1.noarch.rpm"
RPM_HASH = "e7888b97e8e24898bc8db898c223426d58d4589952d18688c368f4f79d21cca6eb82d1b6dedf4495d8bae9d33b4aad323646bd9e857440fa9c211a7034e1beda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moresize.sty \
texlive-moresize"

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
