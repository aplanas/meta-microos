SUMMARY = "Severed fonts for texlive-twemoji-colr"
DESCRIPTION = "The  separated fonts package for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-fonts-2023.209.0.0.7.0svn64854-53.1.noarch.rpm"
RPM_HASH = "c7fb3a65fa6933aab8b9e6befad0ff03f4d214b912abee7a0322f3c1cd15f4a802b9d9ea3f03d7a2e3b30ccd23fd2f3bf48d2146cafb3e5b1e113e6ffcf9b3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=und-zsye \
font-twemojimozilla \
texlive-twemoji-colr-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
