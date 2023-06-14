SUMMARY = "Hardware overview utility"
DESCRIPTION = "CPU-X is a software that gathers information about CPU, motherboard \
and peripherals. It is similar to CPU-Z (Windows) and can be used in \
graphical mode by using GTK or in text-based mode by using NCurses. A \
dump mode is present from command line."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-4.5.3-1.1.aarch64.rpm"
RPM_HASH = "7049ec82a83bd7afc427061d1b86c3e2cb7a13ddddade8b96bae42ee80fd9edd4b4d66ec3226ba4f461107a109f966f7eb0c018e7e58a84359d9b88ef7335308"

RPROVIDES:${PN} += "bundled-bandwidth \
bundled-dmidecode \
cpu-x"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libcairo.so.2 \
libcpuid.so.16 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglfw.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libncursesw.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpci.so.3 \
libprocps.so.8 \
libtinfo.so.6 \
libvulkan.so.1"

inherit rpm
