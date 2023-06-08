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

RPM_NAME = "cdemu-daemon-3.2.6-1.14.aarch64.rpm"
RPM_HASH = "525d9dcd22a7915c8e32636ed45420ae25e03f77575df60f837f1333b026731335cee0c4f0c539ff1647e22b6e5ae907c53d91ca41c0617e47779bdf3db6e066"

RPROVIDES:${PN} += "cdemu-daemon cdemu-daemon(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libao.so.4()(64bit) libao.so.4(LIBAO4_1.1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmirage.so.11()(64bit) vhba-kmp"

inherit rpm
