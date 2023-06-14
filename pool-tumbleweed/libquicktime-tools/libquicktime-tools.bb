SUMMARY = "Libquicktime Tools"
DESCRIPTION = "Tools for reading/writing quicktime movie files."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-tools-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "c3c6489c9262d0105811722b681e6cc1f602dcceca46cfacb11316fbd295f976a0b70ba0d5cd1eaae335d7dd9118addbcdd68289e50e848d8f0bc62677ded98d"

RPROVIDES:${PN} += "libquicktime-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXt.so.6 \
libXv.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libquicktime \
libquicktime.so.0 \
libquicktime0"

inherit rpm
