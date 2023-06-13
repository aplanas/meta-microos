SUMMARY = "Adapter for remmina Python plugins"
DESCRIPTION = "This package provides an adapter used by remmina Python plugins"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-python-wrapper-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "43d3357090e92853d1bbeb29d829b5eedb56143ddbe7c6f6f703c9abed4329001d099d8e94ec7114d8acf4736b4cf652c55cea12585686b75a0067a85320db52"

RPROVIDES:${PN} += "remmina-plugin-python-wrapper \
remmina-plugin-python-wrapper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
remmina"

inherit rpm
