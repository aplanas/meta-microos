SUMMARY = "Decorative swelled rule using font character"
DESCRIPTION = "The package implements a decorative swelled rule using only a \
symbol from a font installed with all distributions of TeX, so \
it works independently, without the need to install any \
additional software or fonts. This is the packaged version of \
the macro which was originally published in the 'Typographers' \
Inn' column in TUGboat 31:1 (2010)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn55230"

RPM_NAME = "texlive-decorule-2023.201.0.0.7svn55230-52.1.noarch.rpm"
RPM_HASH = "ae6401ed83bb28090a47fda4d667b79ea82fcb1ae434f075642143c14b7eacf096c71e0ec6cadfdf8eba853e62a01bd571942de15022bdba829c3b9eb4b160f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(decorule.sty) \
texlive-decorule"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fix-cm.sty) \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
