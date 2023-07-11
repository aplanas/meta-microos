SUMMARY = "Device daemon for cdemu, a virtual CD-ROM device emulator"
DESCRIPTION = "cdemu-daemon receives SCSI commands from kernel module thorugh the \
VHBA module and processes them, passing the requested data back to \
the kernel. The daemon implements the actual virtual device; one \
instance per each device registered by kernel module. It uses \
libmirage for the image access (e.g. sector reading). \
 \
The daemon registers itself on D-BUS's system or session bus \
(depending on the options passed to it) where it exposes an interface \
that can be used by clients to control it."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "cdemu-daemon-3.2.6-1.15.aarch64.rpm"
RPM_HASH = "b6d08f42d91b7be9e0bfb38609049f1163916bf7096a843dc6303933c20f57907653907afbec4eb657d40f97c1c5cac129e34d7fa7edcceda8e5e918a404102d"

RPROVIDES:${PN} += "cdemu-daemon"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmirage.so.11 \
vhba-kmp"

inherit rpm
