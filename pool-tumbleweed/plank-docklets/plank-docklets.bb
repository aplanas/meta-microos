SUMMARY = "A collection of docklets for the Plank dock"
DESCRIPTION = "This package contains a collection of docklets: clippy, clock, cpumonitor, \
desktop, trash and etc."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-docklets-0.11.89-2.4.aarch64.rpm"
RPM_HASH = "5b3addb463b53eaae264d4a38003a41ac23d0191c88280a889ad823961676871137f20985b57e5fd5e108ce9748b483713af788df2f2504272e7d43e559fc16a"

RPROVIDES:${PN} += "plank-docklets \
plank-docklets(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-menu-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libplank.so.1()(64bit) \
libwnck-3.so.0()(64bit) \
plank"

inherit rpm
