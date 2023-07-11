SUMMARY = "MP3 encoding tool"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. This package contains the shineenc command line encoder."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "shine-3.1.1-1.7.aarch64.rpm"
RPM_HASH = "8e9f9055e2c37f6245ab5e95b66f404ecfdc4897aa3c2eb8edeaf5ea10ef65bcc724ceed4b927bb0ddef7792121eb2a5431eea8e14567c4a1c2b998b644b0d32"

RPROVIDES:${PN} += "shine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libshine.so.3"

inherit rpm
