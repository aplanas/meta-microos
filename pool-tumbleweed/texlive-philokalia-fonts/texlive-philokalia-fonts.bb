SUMMARY = "Severed fonts for texlive-philokalia"
DESCRIPTION = "The  separated fonts package for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn45356"

RPM_NAME = "texlive-philokalia-fonts-2023.209.1.2svn45356-52.1.noarch.rpm"
RPM_HASH = "674424466b99624432044ee2e31c56efd4d087eded7f7edaf1fecacf6c79dfb7090de21b4621e422ef3c9600047cfe32be9c09734b123e58155142491485978c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-philokalia \
texlive-philokalia-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
