SUMMARY = "OSS based audio support for QEMU"
DESCRIPTION = "This package contains a module for OSS based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-oss-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "d4f9234a9a9be5e9d4baebfebfe4acb8e9b925e53e87ff02206908e3083375a1b582a59ae9d80ed1aee380d75ef6ea17168d92b734594bf6dcb053430f22c73d"

RPROVIDES:${PN} += "qemu-audio-oss"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
