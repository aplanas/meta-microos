SUMMARY = "Fixes kashida feature in xepersian package"
DESCRIPTION = "The kashida feature in xepersian has problems with some fonts \
such as the HM Series fonts and the XB Series fonts. This \
package fixes these problems. The package requires xepersian \
and l3keys2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn56272"

RPM_NAME = "texlive-xepersian-hm-2023.209.1.1asvn56272-53.2.noarch.rpm"
RPM_HASH = "2950330d71d6b2db6f5910ff55ebe6316fac288adc339e36fc2ed4436ed543241060e85448d24ebe7b0dfaef47944b83c2bd986881aa82cb407d58374808a989"
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
