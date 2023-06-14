SUMMARY = "Severed fonts for texlive-philokalia"
DESCRIPTION = "The  separated fonts package for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn45356"

RPM_NAME = "texlive-philokalia-fonts-2023.201.1.2svn45356-51.1.noarch.rpm"
RPM_HASH = "b95b490618f7efde94bf79aa7f26675c0265358f2ae4a6197cd01f499881a00e22c291d048fba4bac5d5b71912dfeb6f1927a718e207727fcfdf543b23aebef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-philokalia \
texlive-philokalia-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
