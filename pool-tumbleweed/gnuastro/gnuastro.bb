SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-0.19-1.11.aarch64.rpm"
RPM_HASH = "40072e926337fa0e08081e952d713a1f7b6017f0f406717a1f84eddb715f202e94a29374f2dfbe88695ca51982e97487ee8fed8ec2dc39aad029d620ebe6be20"

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
