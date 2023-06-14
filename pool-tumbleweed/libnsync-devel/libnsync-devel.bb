SUMMARY = "Library that exports various synchronization primitives"
DESCRIPTION = "C/C++ library that exports various synchronization primitives: \
	locks \
	condition variables \
	run-once initialization \
	waitable counter (useful for barriers) \
	waitable bit (useful for cancellation, or other conditions)"
LICENSE = "Apache-2.0"

PV = "1.23.0"

RPM_NAME = "libnsync-devel-1.23.0-2.12.aarch64.rpm"
RPM_HASH = "d2fda9d92a92a088411c78e262e05441fba7b404906530eef39b90fd3959e89b7d395b370f028f8044ea1387b4b259754aee3e1a6639465701dc0dbcdcf484bc"

RPROVIDES:${PN} += "libnsync-devel"

RDEPENDS:${PN} += "libnsync-cpp1 \
libnsync1"

inherit rpm
