SUMMARY = "Severed fonts for texlive-esrelation"
DESCRIPTION = "The  separated fonts package for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37236"

RPM_NAME = "texlive-esrelation-fonts-2023.201.svn37236-52.1.noarch.rpm"
RPM_HASH = "919367f502f37b335764d10e9c5378159ad990a5956b4054f7941330cfc42e65edb3258a5b17b040d2c3287a1f250029b1fb5642ebe0574a8e7855a774df57b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-esrelation10 \
texlive-esrelation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
