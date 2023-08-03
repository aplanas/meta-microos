SUMMARY = "Incorporate Metafont pictures in TeX source"
DESCRIPTION = "METATeX is a set of plain TeX and Metafont macros that you can \
use to define both the text and the figures in a single source \
file. Because METATeX sets up two way communication, from TeX \
to Metafont and back from Metafont to TeX, drawing dimensions \
can be controlled by TeX and labels can be located by Metafont. \
Only standard features of TeX and Metafont are used, but two \
runs of TeX and one of Metafont are needed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-metatex-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "ca028b0b7f9b74d5f8f2232fef23b135c56d54a6cfee1f8b7c752efa9ee133ff9adce432daea8d9ff8bee266e251c2ff21ebcbdea516c5f6dc4e4554c0109d64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metatex.tex \
texlive-metatex"

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
