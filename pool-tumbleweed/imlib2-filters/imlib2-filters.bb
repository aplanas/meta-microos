SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.11.1"

RPM_NAME = "imlib2-filters-1.11.1-2.1.aarch64.rpm"
RPM_HASH = "65dc7dd7d5fc1bdfd3364d15a9b74747737410f0dc6c5ce1df60b2f230f647f61de92bea00612b4d41ff2822920b3d29bd6a195f0ff6762997fafbb7da2b7269"

RPROVIDES:${PN} += "imlib2-filters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2-1 \
libImlib2.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
