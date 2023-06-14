SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs. This package \
contains guile modules."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "guile-modules-3_0-3.0.9-1.1.aarch64.rpm"
RPM_HASH = "1dbbcd96252d66aa212f3ff9607f779e3403f513f3b17947d6326e93115d5502d6bde61844706143e57d295128f5662205d873828a1d7347d43b9b90fa1a204c"

RPROVIDES:${PN} += "guile-modules-3-0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libm.so.6 \
libreadline.so.8 \
libunistring.so.5"

inherit rpm
