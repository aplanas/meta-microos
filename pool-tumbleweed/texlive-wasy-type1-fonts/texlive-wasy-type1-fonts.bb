SUMMARY = "Severed fonts for texlive-wasy-type1"
DESCRIPTION = "The  separated fonts package for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-fonts-2023.201.001.002svn53534-53.1.noarch.rpm"
RPM_HASH = "3c692a00e94cde5f99a105929a61f97ffaab85a015eed283db89793fa005ab8e4bed7f56bdaef1f450dafd78d16d831c271636b619570e74c0223ceb94984544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(wasy) \
font(wasysl10) \
texlive-wasy-type1-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
