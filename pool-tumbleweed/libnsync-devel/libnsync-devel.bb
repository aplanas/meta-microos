SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "C/C++ library that exports various synchronization primitives: \
	locks \
	condition variables \
	run-once initialization \
	waitable counter (useful for barriers) \
	waitable bit (useful for cancellation, or other conditions)"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync-devel-1.23.0-2.13.aarch64.rpm"
RPM_HASH = "0a9a788a2b2bfe56c5354fc442f30af04c613fd5aa439d68e87d76bb546948dc8c6eee8088f8fb8201f8c20fc2e5f08e6226b0f61e854efcf3bb3c00d049da0c"

RPROVIDES:${PN} += "libnsync-devel"

RDEPENDS:${PN} += "libnsync-cpp1 \
libnsync1"

inherit rpm
