SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutscan2-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "f20c2f32f927fa9fcab31fa433fceac77ee3531200ca34c86ba9caea1f05ba7fc20f8f213fc483e338aec1ac659afb8f216947ab0153d727936ddaa7c8759d8b"

RPROVIDES:${PN} += "libnutscan.so.2 \
libnutscan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7"

inherit rpm
