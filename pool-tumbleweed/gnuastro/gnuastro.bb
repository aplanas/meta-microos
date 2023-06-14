SUMMARY = "GNU Astronomy Utilities"
DESCRIPTION = "The GNU Astronomy Utilities (Gnuastro) contains various programs and \
library functions for the manipulation and analysis of astronomical \
data."
LICENSE = "GPL-3.0-or-later"

PV = "0.19"

RPM_NAME = "gnuastro-0.19-1.10.aarch64.rpm"
RPM_HASH = "7e5d6060a3bd1e8f32b9c94ff49ffd67be17a13b0eea1c8cb3d8a15eb0907ac9cfa56f3e1f8bec22d73d65a491ee218ab2a264073b1324985974cc13dec7e934"

RPROVIDES:${PN} += "config-gnuastro \
gnuastro"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgnuastro.so.17 \
libgsl.so.27 \
libm.so.6 \
libwcs.so.7"

inherit rpm
