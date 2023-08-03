SUMMARY = "Fixes kashida feature in xepersian package"
DESCRIPTION = "The kashida feature in xepersian has problems with some fonts \
such as the HM Series fonts and the XB Series fonts. This \
package fixes these problems. The package requires xepersian \
and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-2023.209.1.1asvn56272-53.1.noarch.rpm"
RPM_HASH = "86607dabd6bc44035b058886492e1ba9d15267ed5eef99481594545652b705bdd9d6d82655cd292029112556faab6b32edc2633664c35c20d873009e7eefad5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xepersian-hm-common-kashida.tex \
tex-xepersian-hm-kashida.tex \
tex-xepersian-hm.sty \
texlive-xepersian-hm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-xcolor.sty \
tex-xepersian.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
