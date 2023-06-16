SUMMARY = "Spice daemon for the DAV channel"
DESCRIPTION = "The spice-webdavd package contains a daemon to proxy WebDAV request to \
the Spice virtio channel."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "spice-webdavd-3.0-1.3.aarch64.rpm"
RPM_HASH = "f26b2605a5a806c8d9f9b8bd86ff5051be39f07f9b5befa3fffb8344f70c62e8fcd869a1cb422dfd6620644110a4b7af06ad524a209771267971b06f8e039f02"

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
