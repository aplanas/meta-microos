SUMMARY = "Development headers for Boost.Atomic"
DESCRIPTION = "Development support for Boost.Atomic, a library that provides atomic \
data types and operations on these data types, as well as memory \
ordering constraints required for coordinating multiple threads through \
atomic variables."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_atomic-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "c32d4951ca565e4444ed942096cff0e716b281e93844dda3b97546ebd4c5ee2b9f18f80bcb6a728c62b637a5410ea8716e4a6fe8332c7f07b8605b6e89a36d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_atomic-devel"

RDEPENDS:${PN} += "libboost_atomic1_82_0-devel"

inherit rpm
