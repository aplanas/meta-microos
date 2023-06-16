SUMMARY = "LaTeX FAQ by the Chinese TeX Society (ctex.org)"
DESCRIPTION = "Most questions were collected on the bbs.ctex.org forum, and \
were answered in detail by the author."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-ctex-faq-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "2a49fa5c5284d9c67f35645e1c17be382388e64ffa7ebb7c10f41144513327fbdf7decc8a085a1f836f969c209457d4c66d00c63783ef03ebc25a98a72006fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctex-faq"

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
