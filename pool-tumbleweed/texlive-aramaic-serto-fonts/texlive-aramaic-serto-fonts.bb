SUMMARY = "Severed fonts for texlive-aramaic-serto"
DESCRIPTION = "The  separated fonts package for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30042"

RPM_NAME = "texlive-aramaic-serto-fonts-2023.209.1.0svn30042-55.1.noarch.rpm"
RPM_HASH = "8b3a476201734a6b3985662391f7a5660ee235cdc22048f4dc579496b365c0dc8edcc668e82ef62166d1b33b371aa0cd73d81033ef9faa5e0056a99572a3073c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-assy \
font-assyrb10 \
font-serto10 \
font-sertob10 \
texlive-aramaic-serto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
