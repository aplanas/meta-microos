SUMMARY = "Severed fonts for texlive-notomath"
DESCRIPTION = "The  separated fonts package for texlive-notomath"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02svn58726"

RPM_NAME = "texlive-notomath-fonts-2023.209.1.02svn58726-55.1.noarch.rpm"
RPM_HASH = "9257b099a722a892e6c43ff1c606d073e5a70bc89c5f0a898d3e4a9ce35fc93c1b0758ee42c147b2ea10589a65adb7f7ecfa9104db5d599783e23c1254d2a316"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-notomath \
font-notosansmath \
texlive-notomath-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
