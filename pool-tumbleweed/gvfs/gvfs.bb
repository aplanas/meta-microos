SUMMARY = "Virtual File System functionality for GLib"
DESCRIPTION = "gvfs GNOME's userspace virtual filesystem designed to work with the \
I/O abstraction of GIO, a library available with GLib. gvfs installs \
several modules that are automatically used by applications using the \
APIs of libgio. There is also FUSE support that allows applications \
not using GIO to access the GVfs filesystems."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.50.4"

RPM_NAME = "gvfs-1.50.4-2.1.aarch64.rpm"
RPM_HASH = "9012ae108ecb3ed1f8ece3373c96dbeec15b2d8d7a1b9eb15acbcc3cca2516a4bc07dd118bf727a5d5947ce45576a36fb197e8c945955ef59c2da00a6068b361"

RPROVIDES:${PN} += "gvfs \
libgioremote-volume-monitor.so \
libgvfscommon.so \
libgvfsdaemon.so \
libgvfsdbus.so"

RDEPENDS:${PN} += "/bin/sh \
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
