SUMMARY = "VFS functionality for GLib -- Samba Support"
DESCRIPTION = "This package provides a gvfs backend that supports Samba."
LICENSE = "LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-backend-samba-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "7fffa3fc3e9fa4750a724393f7512cfc46c05d414a8ba80a9558cd6b7ba3d01dc2597ae9371850d4839a4f341000f41044aad4c0d0d3e52979ed1b76f75930a0"

RPROVIDES:${PN} += "gvfs-backend-samba"

RDEPENDS:${PN} += "gvfs \
gvfs-backends \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libsmbclient.so.0"

inherit rpm
