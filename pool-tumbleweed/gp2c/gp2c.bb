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

RPM_NAME = "gp2c-0.0.13-1.3.aarch64.rpm"
RPM_HASH = "c541f988fe7335dd43d1380bfbdea141740889fb84234d6a957f5c059b7becc61c135720d22af47456d99395a5aa342319ab33280c5e535fe164eef493a8add5"

RPROVIDES:${PN} += "gp2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
