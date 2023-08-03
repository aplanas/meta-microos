SUMMARY = "Severed fonts for texlive-cryst"
DESCRIPTION = "The  separated fonts package for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cryst-fonts-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "40abc5185bf8d44675963656d82ebed7f17d50110713cc0c3eae14cfd22ed91299dad4dfd2b7b508f9a833f0db95816363bcc8aa9bc2ee1d8380b226166fc52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cryst1 \
texlive-cryst-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
