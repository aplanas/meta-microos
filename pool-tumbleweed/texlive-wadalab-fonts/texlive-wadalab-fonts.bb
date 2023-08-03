SUMMARY = "Severed fonts for texlive-wadalab"
DESCRIPTION = "The  separated fonts package for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42428"

RPM_NAME = "texlive-wadalab-fonts-2023.209.svn42428-54.1.noarch.rpm"
RPM_HASH = "1f52561c586f7e9445d741111d6b9504e320279f2813785526e20b77fb7ee4df358d185856fb0474305d426cd44ca67b78ed0d528ce3afa5f46920fbc2f5a586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=kum \
font--lang=os \
font--lang=ru \
font--lang=sel \
font-dg \
font-dgjhw \
font-dm \
font-mc \
font-mc2 \
font-mr \
font-mr2 \
texlive-wadalab-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
