SUMMARY = "General purpose calculator and mathematics tool"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written. \
 \
GEL (Genius Extenseion Language) is the name of its extension language. \
Many of the standard genius functions are written in GEL itself."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "genius-1.0.27-1.10.aarch64.rpm"
RPM_HASH = "ff46cf8c57ed6efe7c0d9276aadc11a7847371ca1006627aaec6a5cffcb87ad159de59865b6f86931f0b419c43bf63b4a7de9c9c6c5368acdd803f0626def8c6"

RPROVIDES:${PN} += "genius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
