SUMMARY = "Changing \\normalcolor"
DESCRIPTION = "This package provides a command \\setnormalcolor with the same \
syntax as the command \\color either of package color or of \
package xcolor. However, \\setnormalcolor will not change the \
current colour but the normal / default color."
LICENSE = "LPPL-1.0"

PV = "2023.209.r11svn40125"

RPM_NAME = "texlive-normalcolor-2023.209.r11svn40125-55.1.noarch.rpm"
RPM_HASH = "1b4cc73b03aec678c894291b0ba20b7a4875bc077f92f181d5b0b907cfd421b3a3466e3848caa7851ce602a5e2ce7218761a4935cd1607b277b62b9a769825b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-normalcolor.sty \
texlive-normalcolor"

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
