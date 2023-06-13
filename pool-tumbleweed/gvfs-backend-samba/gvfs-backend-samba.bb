SUMMARY = "VFS functionality for GLib -- Samba Support"
DESCRIPTION = "This package provides a gvfs backend that supports Samba."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-backend-samba-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "9f6ab3e9dfcea64692f142829f29ff97cd5e65f6902a3adcb40911136a54a2f5a44f6213c0a5e77be288e79968094e8b4732c44f4c1b81d42641a1ccf3b773f2"

RPROVIDES:${PN} += "gvfs-backend-samba \
gvfs-backend-samba(aarch-64)"

RDEPENDS:${PN} += "gvfs \
gvfs-backends \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgvfscommon.so()(64bit) \
libgvfsdaemon.so()(64bit) \
libsmbclient.so.0()(64bit) \
libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.5.0)(64bit) \
libsmbclient.so.0(SMBCLIENT_0.6.0)(64bit)"

inherit rpm
