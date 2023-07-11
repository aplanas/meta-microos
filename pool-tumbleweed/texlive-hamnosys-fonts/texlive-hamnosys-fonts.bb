SUMMARY = "Severed fonts for texlive-hamnosys"
DESCRIPTION = "The  separated fonts package for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-fonts-2023.201.1.0.3svn61941-53.2.noarch.rpm"
RPM_HASH = "a5c26aea187c56e3c98079bb31d48e2442500a5952201ba4077564c6c1a97cadfe4ce4bfbf838c3502b0b435ab0dae7fc5dcac1f1600829a68ee72fc6aaf1462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-hamnosysunicode \
texlive-hamnosys-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
