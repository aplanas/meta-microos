SUMMARY = "GP script to PARI C program compiler"
DESCRIPTION = "The gp2c compiler is a package for translating GP routines into the C \
programming language, so that they can be compiled and used with the PARI \
system or the GP calculator. \
 \
The main advantage of doing this is to speed up computations and to include \
your own routines within the preexisting GP ones. It may also find bugs in GP \
scripts."
LICENSE = "GPL-2.0-only"

PV = "0.0.13"

RPM_NAME = "gp2c-0.0.13-1.4.aarch64.rpm"
RPM_HASH = "5cafd8c815832ad0b07cbc41a033ea733b5c28dc53ff6715ad273d2db8b23aee563559d7d1dcd78ef86fb56ca10235d9f7300d5ebb9f3bd78c1d321d85e362df"

RPROVIDES:${PN} += "gp2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
