SUMMARY = "Tools based on libcpuid"
DESCRIPTION = "This package provides tools based on libcpuid."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "libcpuid-tools-0.6.3-1.1.aarch64.rpm"
RPM_HASH = "db5607cacb453f2b944cf1c862758ded416302742d338dd9f9850f7a823b6d4f0262be790b36c1540d911ccc1ae1fc1142a1ff6ea98e8e1d1d284e8770b758af"

RPROVIDES:${PN} += "libcpuid-tools \
libcpuid-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcpuid.so.16()(64bit)"

inherit rpm
