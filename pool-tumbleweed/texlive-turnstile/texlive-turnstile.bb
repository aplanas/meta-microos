SUMMARY = "Typeset the (logic) turnstile notation"
DESCRIPTION = "Among other uses, the turnstile sign is used by logicians for \
denoting a consequence relation, related to a given logic, \
between a collection of formulas and a derived formula."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn64967"

RPM_NAME = "texlive-turnstile-2023.209.1.0svn64967-53.1.noarch.rpm"
RPM_HASH = "5dd618f92f459cc811bc08012880e68c8ce76d80d5cc8f7ff187ad244f36153cf732c3e45a44505f0829fb5cdbd3e5d2f5cef85ecee98adb79f993383bcbceb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turnstile.sty \
texlive-turnstile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
