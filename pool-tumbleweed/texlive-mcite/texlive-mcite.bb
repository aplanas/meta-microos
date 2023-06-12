SUMMARY = "Multiple items in a single citation"
DESCRIPTION = "The mcite package allows the user to collapse multiple \
citations into one, as is customary in physics journals. The \
package requires a customised BibTeX style for its work; the \
documentation explains how to do that customisation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.6svn18173"

RPM_NAME = "texlive-mcite-2023.201.1.6svn18173-52.1.noarch.rpm"
RPM_HASH = "34fdffe9e1beda9656bf207048641f79755ac6b50cd20d8ab6a2b651d78f780fd95b963985088a110c2efa30ecdeaff891c49730d90f78ff071865ba0b3d6232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mcite.sty) \
texlive-mcite"
RDEPENDS:${PN} += "/bin/sh \
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
