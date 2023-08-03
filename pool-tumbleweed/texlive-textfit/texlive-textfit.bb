SUMMARY = "Fit text to a desired size"
DESCRIPTION = "Package to fit text to a given width or height by scaling the \
font. For example: \\scaletowidth{3in}{This}. (The job is done \
by calculating a magstep and applying it to the current font; \
thus 'This' will be very tall, as well as very wide; to scale \
in just one dimension, use the facilities of the graphicx \
package.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn20591"

RPM_NAME = "texlive-textfit-2023.209.5svn20591-55.1.noarch.rpm"
RPM_HASH = "adfb1621c1080929855f0d5b8a3846066fd7b4a0b017ce7d824075b3de7fcf3e8fb4ea65614fe22acd0543470c5023f0bee6638228865ad89d2b728144bf63a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textfit.sty \
texlive-textfit"

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
