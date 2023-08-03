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

PV = "2023.209.svn57179"

RPM_NAME = "texlive-apprendre-a-programmer-en-tex-2023.209.svn57179-55.1.noarch.rpm"
RPM_HASH = "a008e2eebfc70597b68411c11b68ea163e229949a26b89b1684ec71838fa8a353090cd52aa929c444145832ebe346914246744822a50c61fde5288ed4d477c41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprendre-a-programmer-en-tex"

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
