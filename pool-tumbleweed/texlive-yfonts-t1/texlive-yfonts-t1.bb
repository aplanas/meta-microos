SUMMARY = "Old German-style fonts, in Adobe type 1 format"
DESCRIPTION = "This package comprises type 1 versions of the Gothic, \
Schwabacher and Fraktur fonts of Yannis Haralambous' set of old \
German fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-2023.209.1.0svn36013-53.1.noarch.rpm"
RPM_HASH = "3b1c209bc41026872e820a26726b6773a1e104eb1bf098a7c97daeae7fae9b702eda83365e400b10e8166f028d06a0032879fbc58041516e673c5082d6ee89d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yfrak.map \
texlive-yfonts-t1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-yfonts-t1-fonts"

inherit rpm
