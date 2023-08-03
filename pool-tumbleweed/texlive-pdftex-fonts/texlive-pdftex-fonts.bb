SUMMARY = "Severed fonts for texlive-pdftex"
DESCRIPTION = "The  separated fonts package for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66243"

RPM_NAME = "texlive-pdftex-fonts-2023.209.svn66243-52.1.noarch.rpm"
RPM_HASH = "3f132a9abdf1c19f36aaa7575a12bd7ce7bc96ab6df2c291a9e9c24aa42dabbb123ee83a5313fc02666c5cb3a6b37fc12543634fddecb5c9649147bc2116eac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dummyspace \
font-pdftex \
texlive-pdftex-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
