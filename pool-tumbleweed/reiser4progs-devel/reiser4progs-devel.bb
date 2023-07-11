SUMMARY = "Headers for the Reiser4 File System tool libraries"
DESCRIPTION = "A set of header C files and static libraries for the Reiser4 file \
system tools."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "reiser4progs-devel-2.0.5-1.8.aarch64.rpm"
RPM_HASH = "876a4c09ca5d2c931f9f5789fa7caa9d88564a6c8ebcaaf7152e0623ffe59e960aec7ce3ba82e892ab98bdc8ddda25b98042af2b13b03b7fca3d52b662e3dabf"

RPROVIDES:${PN} += "reiser4progs-devel"

RDEPENDS:${PN} += "libreiser4-2-0-5 \
libreiser4-minimal-2-0-5 \
librepair-2-0-5"

inherit rpm
