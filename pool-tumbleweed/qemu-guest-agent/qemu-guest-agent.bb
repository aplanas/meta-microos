SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-guest-agent-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "61580abea83af8a232cdd9ac802c2a9cf50957801c95efdf955070c049138d294ba81cbbe73cd2c135f4a78d264a997d37916c2725794452222a326b0e20d0ac"

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
