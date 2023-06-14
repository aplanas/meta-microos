SUMMARY = "Severed fonts for texlive-dad"
DESCRIPTION = "The  separated fonts package for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2svn54191"

RPM_NAME = "texlive-dad-fonts-2023.204.1.2svn54191-54.1.noarch.rpm"
RPM_HASH = "81488d9bf3eb3b7bfeda22cb3dccc956592dce2f567afd738bf5e9115821a430cd4d2fe6a910857f1bacb309a722ce15a26b92865ec1c6d66381c93fe9207e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=ar \
font-dad \
texlive-dad-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
