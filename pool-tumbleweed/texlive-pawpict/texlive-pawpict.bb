SUMMARY = "Using graphics from PAW"
DESCRIPTION = "Support for the easy inclusion of graphics made by PAW (Physics \
Analysis Workstation). You need to have PAW installed on your \
system to benefit from this package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn21629"

RPM_NAME = "texlive-pawpict-2023.209.1.0svn21629-52.1.noarch.rpm"
RPM_HASH = "f39e14c3c8dab661903f0bf884df94cc64c2ce0a87a26dde80ad6055e1b510ac424aacd0a5702239a82b54e35f223422ca6f64929e7d105341dffee27303ac5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pawpict.sty \
texlive-pawpict"

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
