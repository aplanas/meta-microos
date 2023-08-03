SUMMARY = "Severed fonts for texlive-sanskrit-t1"
DESCRIPTION = "The  separated fonts package for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-sanskrit-t1-fonts-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "962c2cbe5b4f10359a58f072103ed55ea9b6e7c3bcdd62afd5da8183226afc8e961c0818cf29fa91969bee2cfb618232fb32c93f706d7fd1745542187e89fb8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-wiknersanskrit \
texlive-sanskrit-t1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
