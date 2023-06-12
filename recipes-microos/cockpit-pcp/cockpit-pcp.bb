SUMMARY = "Cockpit PCP integration"
DESCRIPTION = "Cockpit support for reading PCP metrics and loading PCP archives."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-pcp-276.1-4.4.aarch64.rpm"
RPM_HASH = "260510a3a9970d233a1292e0c6abcabfacdb14e9e3d4bdabc84d502a37c0f946f2fb78f791fed614335aa4e1d9181ec5b09499a2bca7c6cebb7752aac859c10f"

RPROVIDES:${PN} += "cockpit-pcp \
cockpit-pcp(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cockpit-bridge \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.9)(64bit) \
pcp"

inherit rpm
