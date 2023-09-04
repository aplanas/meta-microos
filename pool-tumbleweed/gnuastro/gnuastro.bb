SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "gnuastro-0.20-1.1.aarch64.rpm"
RPM_HASH = "94cb384f13bb4eec0fccc6382384f350a62c24a2febd51444a119b82f0204bae00b4a07c8e145c6d0e15821f9077f56b448ddf615d44f9f60da1e1cd957c82b4"

RPROVIDES:${PN} += "config-gnuastro \
gnuastro"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgnuastro.so.18 \
libgsl.so.27 \
libm.so.6 \
libwcs.so.7"

inherit rpm
