SUMMARY = "Hardware overview utility"
DESCRIPTION = "CPU-X is a software that gathers information about CPU, motherboard \
and peripherals. It is similar to CPU-Z (Windows) and can be used in \
graphical mode by using GTK or in text-based mode by using NCurses. A \
dump mode is present from command line."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-4.5.3-1.1.aarch64.rpm"
RPM_HASH = "7049ec82a83bd7afc427061d1b86c3e2cb7a13ddddade8b96bae42ee80fd9edd4b4d66ec3226ba4f461107a109f966f7eb0c018e7e58a84359d9b88ef7335308"

RPROVIDES:${PN} += "bundled(bandwidth) \
bundled(dmidecode) \
cpu-x \
cpu-x(aarch-64) \
metainfo() \
metainfo(org.cpu-x.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libOpenCL.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcpuid.so.16()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglfw.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpci.so.3()(64bit) \
libprocps.so.8()(64bit) \
libprocps.so.8(LIBPROCPS_0)(64bit) \
libtinfo.so.6()(64bit) \
libvulkan.so.1()(64bit)"

inherit rpm
