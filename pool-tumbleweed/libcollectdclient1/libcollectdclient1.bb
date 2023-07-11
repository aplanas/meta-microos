SUMMARY = "Library for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "libcollectdclient1-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "fb19295b6e9944a3c325a64f69adc67fc09610255b72acc827983ed6d7300f2a553f717ed53e61acd8f9b58f883cddddfbb9c6053d3a9b6311fa0dfad5168283"

RPROVIDES:${PN} += "libcollectdclient \
libcollectdclient.so.1 \
libcollectdclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
