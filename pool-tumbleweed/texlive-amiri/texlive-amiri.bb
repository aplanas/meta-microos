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

PV = "2023.201.1.000svn65191"

RPM_NAME = "texlive-amiri-2023.201.1.000svn65191-54.1.noarch.rpm"
RPM_HASH = "b690f385d8cbc3966a251d9112a53e410e3be2eac17399f5df76472949c8a15d58a9cf21fea32e8042bdfe2f3ab05047867a44ba6c911361c3357922b5a28997"
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
