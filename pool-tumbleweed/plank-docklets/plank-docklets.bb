SUMMARY = "A collection of docklets for the Plank dock"
DESCRIPTION = "This package contains a collection of docklets: clippy, clock, cpumonitor, \
desktop, trash and etc."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-docklets-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "5b3addb463b53eaae264d4a38003a41ac23d0191c88280a889ad823961676871137f20985b57e5fd5e108ce9748b483713af788df2f2504272e7d43e559fc16a"

RPROVIDES:${PN} += "plank-docklets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-menu-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libplank.so.1 \
libwnck-3.so.0 \
plank"

inherit rpm
