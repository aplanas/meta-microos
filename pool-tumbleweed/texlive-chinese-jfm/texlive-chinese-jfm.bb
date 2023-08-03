SUMMARY = "Luatexja-jfm files for Chinese typesetting"
DESCRIPTION = "ChineseJFM is a series of luatexja-jfm files for better Chinese \
typesetting, providing quanjiao, banjiao, and kaiming three \
styles and other fancy features. It can be used for both \
horizontal and vertical writing mode in Simplified/Traditional \
Chinese or Japanese fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-2023.209.1.1.1svn57758-54.1.noarch.rpm"
RPM_HASH = "7101ed4bbe0607b5c3395da220ba12e10b275337787c24ade75d7e4e303892ac830184b89645f1bb9323c7e604fbb7ef5183cfba753bcff4df67e974e80a7aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chinese-jfm"

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
