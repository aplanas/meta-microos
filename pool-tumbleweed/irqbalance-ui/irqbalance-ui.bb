SUMMARY = "UI for IRQ balance Daemon"
DESCRIPTION = "Text UI for the IRQ balance daemon."
LICENSE = "GPL-2.0-or-later"

PV = "1.9.2"

RPM_NAME = "irqbalance-ui-1.9.2-3.3.aarch64.rpm"
RPM_HASH = "c55b0e7c32d3b89526e41b3e0aab49dbcde52e6b05090bf09535633a6824991df2f8ebe8b06c9605a024f6a47e508a49df87be48ca2539476130df3b788580c8"

RPROVIDES:${PN} += "irqbalance-ui"

RDEPENDS:${PN} += "irqbalance \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
