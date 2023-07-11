SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libupsclient6-2.8.0-3.1.aarch64.rpm"
RPM_HASH = "25ffa7a42297dc258c30c09419bb26dda5c43a9d59701c76ce6013d3aa5c227c745b0b80e8b92a7823254ad439743b89b72556d394f88506cc650aab00a61831"

RPROVIDES:${PN} += "libupsclient.so.6 \
libupsclient6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
