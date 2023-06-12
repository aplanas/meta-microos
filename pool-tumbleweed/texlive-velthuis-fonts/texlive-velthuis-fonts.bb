SUMMARY = "Severed fonts for texlive-velthuis"
DESCRIPTION = "The  separated fonts package for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-fonts-2023.201.2.17.1svn66186-53.1.noarch.rpm"
RPM_HASH = "31976cca1af1a631ed49008a7920d54a9a21da86290b5f7237235fbfc00322ffff0c5450e8b594b7d91a4f261433c7d48c6d71df788530b65e5b726c2c69e626"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(velthuisdevanagari) \
texlive-velthuis-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
