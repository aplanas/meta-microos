SUMMARY = "A classical Arabic typeface, Naskh style"
DESCRIPTION = "Amiri is a classical Arabic typeface in Naskh style for \
typesetting books and other running text. It is a revival of \
the beautiful typeface pioneered in the early 20th century by \
Bulaq Press in Cairo, also known as Amiria Press, after which \
the font is named. The project aims at the revival of the \
aesthetics and traditions of Arabic typesetting, and adapting \
it to the era of digital typesetting, in a publicly available \
form."
LICENSE = "OFL-1.1"

PV = "2023.209.1.000svn65191"

RPM_NAME = "texlive-amiri-2023.209.1.000svn65191-55.1.noarch.rpm"
RPM_HASH = "1c288d9fce9dabe335d8261c3d3170cdffbede78541ff2e00991c1597cd69f75485c61451c49b05ed1b855864ad4e719baa59654edbf7bf6a556443a4439db2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amiri"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-amiri-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
