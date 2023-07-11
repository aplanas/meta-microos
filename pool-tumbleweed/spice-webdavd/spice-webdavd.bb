SUMMARY = "Spice daemon for the DAV channel"
DESCRIPTION = "The spice-webdavd package contains a daemon to proxy WebDAV request to \
the Spice virtio channel."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "spice-webdavd-3.0-1.4.aarch64.rpm"
RPM_HASH = "3f5c1898098b494e2bd28c99ae30ae2443caca2cc5ddcb460b2cb625d60bf78c70cbd45cba92a336867200799af50ed7e487c58d6e5c5b7d1ee10825fcd576cb"

RPROVIDES:${PN} += "spice-webdavd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-gobject.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
systemd"

inherit rpm
