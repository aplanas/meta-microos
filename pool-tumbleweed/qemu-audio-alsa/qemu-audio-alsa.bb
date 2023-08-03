SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-alsa-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "23b4fd7ce0a2e485eea4113ca4e3624e6d6f86e435511d45ab16e85418a863b09207ef93db97268c8ab4568f3bc7679da7c7bf0eb830698e5b5e642be37cf86e"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
