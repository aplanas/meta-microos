SUMMARY = "DVI document support for Evince"
DESCRIPTION = "A plugin for Evince to read DVI documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-dvidocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "44d0d75663b632fb0b22f145a62f11a4b8fd6ec83d88fe9afcb510b7c71c00448502a5bcfe5102112776acc2b562f90e347d66586540e212a75e802a74b95fc8"

RPROVIDES:${PN} += "evince-plugin-dvidocument \
evince-plugin-dvidocument(aarch-64) \
libdvidocument.so()(64bit) \
metainfo() \
metainfo(evince-dvidocument.metainfo.xml)"
RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libevdocument3.so.4()(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libspectre.so.1()(64bit)"

inherit rpm