SUMMARY = "Libquicktime Tools"
DESCRIPTION = "Tools for reading/writing quicktime movie files."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4+git20180804.fff99cd"

RPM_NAME = "libquicktime-tools-1.2.4+git20180804.fff99cd-4.1.aarch64.rpm"
RPM_HASH = "c3c6489c9262d0105811722b681e6cc1f602dcceca46cfacb11316fbd295f976a0b70ba0d5cd1eaae335d7dd9118addbcdd68289e50e848d8f0bc62677ded98d"

RPROVIDES:${PN} += "libquicktime-tools \
libquicktime-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXext.so.6()(64bit) \
libXt.so.6()(64bit) \
libXv.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libquicktime \
libquicktime.so.0()(64bit) \
libquicktime0"

inherit rpm
