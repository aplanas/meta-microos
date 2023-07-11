SUMMARY = "Hardware overview utility"
DESCRIPTION = "CPU-X is a software that gathers information about CPU, motherboard \
and peripherals. It is similar to CPU-Z (Windows) and can be used in \
graphical mode by using GTK or in text-based mode by using NCurses. A \
dump mode is present from command line."
LICENSE = "GPL-3.0-or-later"

PV = "4.5.3"

RPM_NAME = "cpu-x-4.5.3-1.2.aarch64.rpm"
RPM_HASH = "448bf5f406327aaf3721bebcfba3c73d798c1a93088fcdbd26b3e3ed1f9183b611fee3594498c91eb731af9285a9ac8070955581fe7db7ae6deccc55198c06c4"

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
