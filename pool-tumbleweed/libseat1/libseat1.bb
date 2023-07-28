SUMMARY = "Seat management library"
DESCRIPTION = "A seat management library allowing applications to use whatever seat management is available. \
Supports: seatd, (e)logind, embedded seatd for standalone operation"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "libseat1-0.8.0-1.1.aarch64.rpm"
RPM_HASH = "86d8bed77cd116336a381992cbc7890c9d1a2f69aafc686d294e3423e6f5a4b3aa14f85e59007280edd5a7f48e5dbb549c2fadfa1f833ebc2df59ce9b3ceaeda"

RPROVIDES:${PN} += "libseat.so.1 \
libseat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0"

inherit rpm
