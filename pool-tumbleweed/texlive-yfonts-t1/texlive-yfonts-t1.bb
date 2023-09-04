SUMMARY = "Old German-style fonts, in Adobe type 1 format"
DESCRIPTION = "This package comprises type 1 versions of the Gothic, \
Schwabacher and Fraktur fonts of Yannis Haralambous' set of old \
German fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-2023.209.1.0svn36013-53.2.noarch.rpm"
RPM_HASH = "a9c09cb5343a0f2ba3e67b15b6898e2c8e0a7e222bba61a054dfaf50323a0e071d706d1dae41215cb124f8c880a74bc8cd401a0899e3a6ba5c9f740445ddbc22"
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
