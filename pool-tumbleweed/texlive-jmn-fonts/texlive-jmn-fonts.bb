SUMMARY = "Severed fonts for texlive-jmn"
DESCRIPTION = "The  separated fonts package for texlive-jmn"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45751"

RPM_NAME = "texlive-jmn-fonts-2023.201.svn45751-55.1.noarch.rpm"
RPM_HASH = "8f9e47152eecec1d9ad2a713c4e9e975e6bc48f07a7c45a5637a2f0a1caa7ebb9d10392d6e89eee8247dae49be4f859c6112a80fc5d981621932e59f9d169ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(hans) \
font(hans-sh) \
texlive-jmn-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
