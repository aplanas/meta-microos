SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-alsa-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "becb59c637c9928c9d35b8a1b3743d56ba753f6afc5b1b22251caa70941e3c21cd0a77bc4a03445de4909544b4c6c9d5927a2490633395ad433d2b816a4bf76a"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
