SUMMARY = "Guest agent for QEMU"
DESCRIPTION = "This package contains the QEMU guest agent. It is installed in the linux guest \
to provide information and control at the guest OS level."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-guest-agent-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "2b3029a68e4b28fe05f441df123e53fe30fe5c3e137f603299afa13ecb86d99b42d4e575eaa2937d4337112835c1919be334be940849d620a23f6af2f8fb8514"

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
