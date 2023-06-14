SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-alsa-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "803b04e00945b06107a77d42818306845208d1ffd06f4c8d84b03947f9af61b0303b337ec0ebe5e4755ec67ed540b17548188eccbc949c422982e4aacc75b099"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
