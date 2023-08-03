SUMMARY = "Document Class for Journal of the Physical Society of Japan"
DESCRIPTION = "The jpsj package"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn66115"

RPM_NAME = "texlive-jpsj-2023.209.1.2.2svn66115-56.1.noarch.rpm"
RPM_HASH = "8b81aa00cf6f54b29b91a3f39bd33a64a156f1aad395e79a50917510e84f621d854888383ee98cbddc491a13f4bf66a4cb4b2a13643b96aa6c9a604e98959390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jpsj2.cls \
texlive-jpsj"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-graphicx.sty \
tex-overcite.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
