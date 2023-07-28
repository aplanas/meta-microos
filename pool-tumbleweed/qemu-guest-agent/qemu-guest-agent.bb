SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-guest-agent-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "b9692c97ef1d0c071533ce5714e7b8f43e7dd67f9c00ae481c16e9a67935ede558352a1b58d799be5e4ecc698f9ac2cf17b969bcfceeadcfbb7868ed3f37f161"

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
