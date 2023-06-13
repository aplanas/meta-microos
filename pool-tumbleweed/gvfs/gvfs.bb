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
gvfs(aarch-64) \
libgioremote-volume-monitor.so()(64bit) \
libgvfscommon.so()(64bit) \
libgvfsdaemon.so()(64bit) \
libgvfsdbus.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
glib2-tools \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
systemd"

inherit rpm
