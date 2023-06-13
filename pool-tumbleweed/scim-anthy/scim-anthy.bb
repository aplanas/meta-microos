SUMMARY = "Anthy Input Method Engine for SCIM"
DESCRIPTION = "Anthy Input Method Engine for SCIM"
LICENSE = "LGPL-2.1+"

PV = "1.3.2"

RPM_NAME = "scim-anthy-1.3.2-1.29.aarch64.rpm"
RPM_HASH = "1df4a6f6b96b3408af6e9dc168ad952d4bfd2a81cf7855e2525372ccfdfdaf9a67273086d1003ec84b3c54a1cd6fc673b106fb06d49d3f46cc19469c55ffca29"

RPROVIDES:${PN} += "scim-anthy \
scim-anthy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libanthy.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libscim-1.0.so.8()(64bit) \
libscim-gtkutils-1.0.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
