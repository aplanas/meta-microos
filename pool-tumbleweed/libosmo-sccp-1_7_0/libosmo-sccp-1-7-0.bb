SUMMARY = "Osmocom Signalling Connection Control Part library"
DESCRIPTION = "The Signalling Connection Control Part (SCCP) is a network layer \
protocol that provides extended routing, flow control, segmentation, \
connection-orientation, and error correction facilities in Signaling \
System 7 telecommunications networks. SCCP relies on the services of \
MTP for basic routing and error detection."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sccp-1_7_0-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "ec2cd829947fedf502b79930eeda38e69438062be0077754ebc0e3d04051fe41aee67d72a35e28a578914477c307e8274fde22438996e21595460686c6e9c08c"

RPROVIDES:${PN} += "libosmo-sccp-1-7-0 \
libosmo-sccp-1.7.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
