SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutscan2-2.8.0-2.1.aarch64.rpm"
RPM_HASH = "840d8b3a5112853db3f48c813cc5a810a3a68a0f90232676d068637ecd6b6b44a070ea91418174fdb0577de37356b41005a1b7ad01f24ed0541550164a7f474e"

RPROVIDES:${PN} += "libnutscan.so.2()(64bit) \
libnutscan2 \
libnutscan2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libltdl.so.7()(64bit)"

inherit rpm
