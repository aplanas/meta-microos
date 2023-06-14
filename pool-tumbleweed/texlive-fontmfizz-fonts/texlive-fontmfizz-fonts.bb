SUMMARY = "Severed fonts for texlive-fontmfizz"
DESCRIPTION = "The  separated fonts package for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43546"

RPM_NAME = "texlive-fontmfizz-fonts-2023.201.svn43546-52.1.noarch.rpm"
RPM_HASH = "c04f06b492a44ccb41504bc01af385f25ff39fa9a8378684673a294ed7a68d995cd92e40524600800e9576a2d4b2af3e75ef2132ab8d8711832b056f7557fb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-font-mfizz \
texlive-fontmfizz-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
