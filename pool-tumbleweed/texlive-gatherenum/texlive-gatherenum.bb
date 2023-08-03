SUMMARY = "A crossover of align* and enumerate"
DESCRIPTION = "This package (ab)uses the inline enumeration capabilities of \
enumitem to add a 'displayed' enumeration mode, triggered by \
adding 'gathered' to the key-value option list of the enumerate \
environment. The end result is similar to a regular enumerate \
environment wrapped in a multicols environment, with the \
following advantages: Gathered enumerate can pack items \
depending on their actual width rather than a fixed, constant \
number per line. Gathered enumeration fills items in a \
line-major order (instead of column-major order), which my \
students found less confusing. YMMV. The package depends on \
enumitem, expl3, and xparse,"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.8svn52209"

RPM_NAME = "texlive-gatherenum-2023.209.1.8svn52209-53.1.noarch.rpm"
RPM_HASH = "ec6b0cda7054760f359e1ca84bd0af0ff87720d02ade1bf5a148a21a0b4366c0d4d723224bf027dd46cb6fc882e1349ef8750dfbc4e2f3c12312d7a01025f556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gatherenum.sty \
texlive-gatherenum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
