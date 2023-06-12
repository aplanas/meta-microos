SUMMARY = "Severed fonts for texlive-noto-emoji"
DESCRIPTION = "The  separated fonts package for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2023.201.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-fonts-2023.201.2.034svn62950-54.1.noarch.rpm"
RPM_HASH = "7fc8ad0966126d94b15ba63e0970df1b76a929b85fc490ed8236dda6c012f915f7ec01450533bdc9fe05a2aaa050ea3da25b83a38cbd2fa1bfa43c19648ff48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=und-zsye) \
font(notocoloremoji) \
font(notoemoji) \
texlive-noto-emoji-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
