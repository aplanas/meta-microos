SUMMARY = "Library for collectd clients"
DESCRIPTION = "Library which abstracts communication with the collectd \
unixsock plugin for clients."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "libcollectdclient1-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "810b78291b5c8c901c2199051fd17a1893299be4eb8b2e5fcd906764e379f4e985fb0f1d6db8e42b13a6eade87635fd93206d7183ba7c6d1ce4f45ac25221166"

RPROVIDES:${PN} += "libcollectdclient \
libcollectdclient.so.1 \
libcollectdclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20"

inherit rpm
