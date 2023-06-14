SUMMARY = "Development package for FUSE (userspace filesystem) modules"
DESCRIPTION = "This package contains the static library variants of libfuse."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-devel-static-2.9.9-6.3.aarch64.rpm"
RPM_HASH = "50c6cb4bddd4c08288d7945430e8c0b204af6824765f8769786d733d33d27a366538780d1be41f04a084056132f9c3def772e5e1c9f6ddc5bb588c786a229d53"

RPROVIDES:${PN} += "fuse-devel-/usr/lib64/libfuse.a \
fuse-devel-static"

RDEPENDS:${PN} += "fuse-devel"

inherit rpm
