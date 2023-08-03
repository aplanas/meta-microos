SUMMARY = "LaTeX FAQ by the Chinese TeX Society (ctex.org)"
DESCRIPTION = "Most questions were collected on the bbs.ctex.org forum, and \
were answered in detail by the author."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ctex-faq-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "383968c471af24885edce68c57dc4a8e39c68cda4e9829e2bb8338bd13bab19a75a845a7f5826674129044998cb591481170c17cda1e299439b79b4d57d8e24c"
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
