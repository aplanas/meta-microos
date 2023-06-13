SUMMARY = "Changing \\normalcolor"
DESCRIPTION = "This package provides a command \\setnormalcolor with the same \
syntax as the command \\color either of package color or of \
package xcolor. However, \\setnormalcolor will not change the \
current colour but the normal / default color."
LICENSE = "LPPL-1.0"

PV = "2023.201.r11svn40125"

RPM_NAME = "texlive-normalcolor-2023.201.r11svn40125-54.1.noarch.rpm"
RPM_HASH = "c6eecba16a970b4305490453c16a8b05d8dd5114ec842ff8ee77ccab192ff1adfbdcbf22fe0f61d7567c0f87dea52122f2465b81f062f137cddc674a70e888b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(normalcolor.sty) \
texlive-normalcolor"

RDEPENDS:${PN} += "/bin/sh \
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
