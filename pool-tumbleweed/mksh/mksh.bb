SUMMARY = "MirBSD Korn Shell"
DESCRIPTION = "The MirBSD Korn Shell is an actively developed free implementation of the Korn \
Shell programming language and a successor to the Public Domain Korn Shell \
(pdksh)."
LICENSE = "MirOS & ISC"

PV = "59c"

RPM_NAME = "mksh-59c-4.4.aarch64.rpm"
RPM_HASH = "cd9af2850367f548adcebeb0d17cab3a5bc3d9c75a71dcbccc440371b8d6937a13c302d9c4709733d6722d2f9c6c2bc1c83323136b28d8f4ae95faf3b07777ca"

RPROVIDES:${PN} += "/usr/bin/ksh \
mksh \
pdksh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
