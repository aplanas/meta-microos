SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-guest-agent-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "10da0c857aa392ccce8ac74d6d2474074c28f2e1a2741ff48c812c624610cf45eec6f1d509b8ff4e691ad4a10895da5bb1e16b78742b6ded98c27a02e02ededb"

RPROVIDES:${PN} += "qemu-guest-agent"

RDEPENDS:${PN} += "/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1 \
libudev.so.1 \
liburing.so.2 \
udev"

inherit rpm
