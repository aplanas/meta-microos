SUMMARY = "Severed fonts for texlive-lineara"
DESCRIPTION = "The  separated fonts package for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63169"

RPM_NAME = "texlive-lineara-fonts-2023.209.svn63169-55.1.noarch.rpm"
RPM_HASH = "f64007a4fe07f427d483095a335a4604f957475fa798f5ae12aa55739bd61f3bef8c87d010bad623dbec131fb5f4fe2cb36c99b1478fb1500274269bd21943a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-lineara \
font-linearacmplxsigns \
texlive-lineara-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
