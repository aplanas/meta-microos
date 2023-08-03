SUMMARY = "A 'Chicago' bibliography style"
DESCRIPTION = "Chicago is a BibTeX style that follows the 'B' reference style \
of the 13th Edition of the Chicago manual of style; a LaTeX \
package (to LaTeX 2.09 conventions) is also provided. The style \
was derived from the newapa style."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chicago-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "babef9b41b7604b40ade48601490fc6a516e9239f25fdcb4e9d7efa0d8fbe8d12c69d191f363570b3795f54de84a0a184fbd279246c2bbe20d6cd4014be9b3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chicago.sty \
texlive-chicago"

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
