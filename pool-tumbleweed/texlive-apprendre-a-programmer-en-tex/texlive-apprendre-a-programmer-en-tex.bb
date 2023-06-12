SUMMARY = "The book 'Apprendre a programmer en TeX'"
DESCRIPTION = "This book explains the basic concepts required for programming \
in TeX and explains the programming methods, providing many \
examples. The package makes the compileable source code as well \
as the compiled pdf file accessible to everyone. Ce livre \
expose les concepts de base requis pour programmer en TeX et \
decrit les methodes de programmation en s'appuyant sur de \
nombreux exemples. Ce package met a disposition de tous le code \
source compilable ainsi que le fichier pdf du livre."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn57179"

RPM_NAME = "texlive-apprendre-a-programmer-en-tex-2023.201.svn57179-54.1.noarch.rpm"
RPM_HASH = "60fda83f3ce218c9b980c11031718c9918ca609766b761c5807cf7cb50e179a0a0fd95ac6ddbd0eb07f4058279a6195acd90a3e5e5dc5aa78436c989d7502e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprendre-a-programmer-en-tex"
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
