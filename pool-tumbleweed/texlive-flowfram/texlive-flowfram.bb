SUMMARY = "Create text frames for posters, brochures or magazines"
DESCRIPTION = "The flowfram package enables you to create frames in a document \
such that the contents of the document environment flow from \
one frame to the next in the order in which they were defined. \
This is useful for creating posters or magazines, indeed any \
form of document that does not conform to the standard one or \
two column layout."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn35291"

RPM_NAME = "texlive-flowfram-2023.209.1.17svn35291-53.1.noarch.rpm"
RPM_HASH = "fb9de2f4f75eaab81920cfafcdd9bcef14a1918743e115350ad4e37f2b22249d5f7eda5ff912c143b00d108138e285c9b5713c7f8e952c8f50b8ba0d5139733e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flowfram.sty \
texlive-flowfram"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-graphics.sty \
tex-ifthen.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
