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

RPM_NAME = "cdemu-daemon-3.2.6-1.16.aarch64.rpm"
RPM_HASH = "7a47987daf22d7db1dab7063370b05f4cc9c017037b1d57bf45aa5eaaeefe568d28159567abe5332574374e90564229729198654b1bfc549ba8fe251fb9c872d"

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
