SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-0.19-1.12.aarch64.rpm"
RPM_HASH = "4dffdc39b6e7757ddb71622a6c79b138621d6f14fbc52df0446b0e0b9e47b3e2a2be748f704295532c358f606a54303f777791eefe33c14213396a178efaf115"

RPROVIDES:${PN} += "config-gnuastro \
gnuastro"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgnuastro.so.17 \
libgsl.so.27 \
libm.so.6 \
libwcs.so.7"

inherit rpm
