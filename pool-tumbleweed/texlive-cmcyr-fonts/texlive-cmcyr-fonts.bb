SUMMARY = "Severed fonts for texlive-cmcyr"
DESCRIPTION = "The  separated fonts package for texlive-cmcyr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn60630"

RPM_NAME = "texlive-cmcyr-fonts-2023.209.svn60630-54.1.noarch.rpm"
RPM_HASH = "acc8d91e870c5fd5f4d9218d56c7b5cfd698faf71051b3abf9022c321dc9eeb3c02e613e0313ec5a9778ce2170aee318aacebd3b20a5ca771282cbf817943519"
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

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
