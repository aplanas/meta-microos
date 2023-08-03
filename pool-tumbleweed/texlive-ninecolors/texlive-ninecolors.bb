SUMMARY = "Select colors with proper WCAG color contrast"
DESCRIPTION = "This package carefully selects and defines 9 colors for 13 hues \
each. All colors with the same suffix number have equal \
luminance level. Also the color black is of level 0, and the \
color white is of level 10. By simply choosing two colors in \
the above list, which differ in level by at least 5, as \
foreground and background colors, you will get proper WCAG \
Color Contrast."
LICENSE = "LPPL-1.0"

PV = "2023.209.2022dsvn62006"

RPM_NAME = "texlive-ninecolors-2023.209.2022dsvn62006-55.1.noarch.rpm"
RPM_HASH = "056ee37a81983679cb6ffa3057e85b0c05d0d955b7cd510587bd28a0007d9d6a82a3e5710f4091f75f85f9ef1aa9f4f5d54cd42ae1ce7710eae89c97361723c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ninecolors.sty \
texlive-ninecolors"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
