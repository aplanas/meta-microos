SUMMARY = "Development files for libliftoff"
DESCRIPTION = "The libliftoff-devel package contains libraries and header files for \
developing applications that use libliftoff."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "libliftoff-devel-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "6b5fa45854f5563af102a814d9b57916ffc39a31b81a6a8b12aa2368d21290393392143248d8fee1f4d057ad9c7ca4317559ef4299536bc551d24ac88e1ce4d7"

RPROVIDES:${PN} += "libliftoff-devel \
libliftoff-devel(aarch-64) \
pkgconfig(libliftoff)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libliftoff0 \
pkgconfig(libdrm)"

inherit rpm
