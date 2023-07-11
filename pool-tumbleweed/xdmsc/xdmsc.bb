SUMMARY = "XTerminal -- Use SUSE Linux as an X Terminal"
DESCRIPTION = "Some useful scripts for using SUSE Linux as an X terminal. \
 \
You will find the documentation in the following directory \
 \
/usr/share/doc/packages/xdmsc/"
LICENSE = "GPL-2.0"

PV = "0.6"

RPM_NAME = "xdmsc-0.6-2.6.noarch.rpm"
RPM_HASH = "1c4430f9f4789fad47430cf5a7cbc3c3138c5c1c79ea41f09f5b98e9c1213bdc98e2f0da1110c19f6c9280ef508bb4b3e60f69b9523afd3203908c22472fdccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Xterminal \
xdmsc"

RDEPENDS:${PN} += "/usr/bin/sh \
fillup"

inherit rpm
