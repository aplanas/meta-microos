SUMMARY = "Virtual File System functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. There is also FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.50.5"

RPM_NAME = "gvfs-1.50.5-1.1.aarch64.rpm"
RPM_HASH = "2a8d62fb4ce8e8c1f84cd88bda7b4ccb09ca1cf5b179d2fb21b32e20426586db76d31186346e7246ecd87101a852b697f12c640733e004a22d2acdb4748fcb36"

RPROVIDES:${PN} += "gvfs \
libgioremote-volume-monitor.so \
libgvfscommon.so \
libgvfsdaemon.so \
libgvfsdbus.so"

RDEPENDS:${PN} += "/usr/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libsecret-1.so.0 \
systemd"

inherit rpm
