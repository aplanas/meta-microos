SUMMARY = "Extra fonts and scripts for CJK LaTeX"
DESCRIPTION = "This package contains some extra font setup files and scripts to \
automatically generate fonts and setup files to use with CJK LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "20070515"

RPM_NAME = "texlive-cjk-latex-extras-20070515-193.2.noarch.rpm"
RPM_HASH = "1315f3e578385e32cd5c64a565f5e2a683ef766124d9da35492a60a95e8b09771b4ea0b701f01e0061d2d5cafa56dafd5ed7d1781cbda204e9d8b6cc73da0faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cjk-ja;ko;zh \
texlive-cjk-latex-extras"

RDEPENDS:${PN} += "/bin/mkdir \
/bin/rm \
/bin/sh \
/usr/bin/perl \
/usr/bin/touch \
/usr/bin/updmap \
freetype-tools \
texlive-cjk \
texlive-latex"

inherit rpm
