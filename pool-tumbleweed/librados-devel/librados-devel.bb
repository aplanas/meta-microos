SUMMARY = "RADOS headers"
DESCRIPTION = "This package contains C libraries and headers needed to develop programs \
that use RADOS object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "librados-devel-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "3bc80cc0ef0bda9ca131c9d87173d1fa6fab32627dfae0ed8b33d416f24d71ccf8adbe33b78d09899f863ca45b3d6ed4f7c17dbac4bf9331e200205b51781c1f"

RPROVIDES:${PN} += "librados-devel \
librados2-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
