SUMMARY = "Macros for French teachers of mathematics"
DESCRIPTION = "A collection of macros for French maths teachers in colleges \
and lycees (and perhaps elsewhere). It is hoped that the \
package will facilitate the everyday use of LaTeX by \
mathematics teachers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "6c723edc0771b23305b811e0204d0efca895cca3d99f2a321eb792feff7f1a64f475c98f0a6d558e2a7de3bb72ac4e5438e63ac10285adb50f2c903426841455"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tdsfrmath.sty \
texlive-tdsfrmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-ifthen.sty \
tex-stmaryrd.sty \
tex-suffix.sty \
tex-xargs.sty \
tex-xkeyval.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
