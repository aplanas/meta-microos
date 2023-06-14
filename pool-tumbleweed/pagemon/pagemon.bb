SUMMARY = "Interactive memory/page monitoring tool"
DESCRIPTION = "pagemon is a ncurses based interactive memory/page monitoring tool \
allowing one to browse the memory map of an active running process \
on Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.02.01"

RPM_NAME = "pagemon-0.02.01-1.2.aarch64.rpm"
RPM_HASH = "360196e669f765a77f0042dacae7f183cd5f912c5e0312e9641a4df2bcb7aedafa3ccc36f212666ab458526e36bc821dc834c1ca13a4f1bc0620b40ed3d4a32b"

RPROVIDES:${PN} += "pagemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
