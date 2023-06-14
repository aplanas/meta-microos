SUMMARY = "Severed fonts for texlive-cmcyr"
DESCRIPTION = "The  separated fonts package for texlive-cmcyr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn60630"

RPM_NAME = "texlive-cmcyr-fonts-2023.201.svn60630-53.1.noarch.rpm"
RPM_HASH = "8688644b47bb7abe5dc7d18b605146e1df59b78eea201de508148c61beb06e150bd455fa011220268cf9382654c92da599e09a6a1e9e125df9209e23f6609b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=bg \
font--lang=kum \
font--lang=os \
font--lang=ru \
font--lang=sel \
font-cmcb10 \
font-cmcbx10 \
font-cmcbx12 \
font-cmcbx5 \
font-cmcbx6 \
font-cmcbx7 \
font-cmcbx8 \
font-cmcbx9 \
font-cmcbxsl10 \
font-cmcbxti10 \
font-cmccsc10 \
font-cmccsc8 \
font-cmccsc9 \
font-cmcinch72 \
font-cmcitt10 \
font-cmcsl10 \
font-cmcsl12 \
font-cmcsl8 \
font-cmcsl9 \
font-cmcsltt10 \
font-cmcss10 \
font-cmcss12 \
font-cmcss17 \
font-cmcss8 \
font-cmcss9 \
font-cmcssbx10 \
font-cmcssdc10 \
font-cmcssi10 \
font-cmcssi12 \
font-cmcssi17 \
font-cmcssi8 \
font-cmcssi9 \
font-cmcssq8 \
font-cmcssqi8 \
font-cmcti10 \
font-cmcti12 \
font-cmcti7 \
font-cmcti8 \
font-cmcti9 \
font-cmctt10 \
font-cmctt12 \
font-cmctt8 \
font-cmctt9 \
font-cmcu10 \
font-cmcyr10 \
font-cmcyr12 \
font-cmcyr17 \
font-cmcyr5 \
font-cmcyr6 \
font-cmcyr7 \
font-cmcyr8 \
font-cmcyr9 \
texlive-cmcyr-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
