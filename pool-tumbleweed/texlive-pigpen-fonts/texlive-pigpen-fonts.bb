SUMMARY = "Severed fonts for texlive-pigpen"
DESCRIPTION = "The  separated fonts package for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-fonts-2023.209.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "ce54db68cf0b9d4654fcd1ead159457ea0616dbe2116e1b7c58c373eb6531c6c3c42029c131d50a10ce281b175dba6b6e48969299c1f5f782f1f76ac87378e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pigpen \
texlive-pigpen-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
