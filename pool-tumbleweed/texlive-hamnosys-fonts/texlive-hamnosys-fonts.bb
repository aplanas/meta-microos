SUMMARY = "Severed fonts for texlive-hamnosys"
DESCRIPTION = "The  separated fonts package for texlive-hamnosys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-fonts-2023.209.1.0.3svn61941-54.1.noarch.rpm"
RPM_HASH = "dc61eeb34c4a2525dc31cbb239658238e638b6d8d388788d6f8f203e9ed9c49eef876e4665b0994c9aa29da370dd5ed01aa058c048a97ae56690615c6fb89b68"
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
