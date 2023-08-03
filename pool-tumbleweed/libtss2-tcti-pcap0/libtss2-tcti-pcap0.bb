SUMMARY = "TCTI pcap interface library"
DESCRIPTION = "A TCTI which prints TPM commands and responses to a file in pcap-ng format. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-pcap0-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "ae5200f6e960e5242f5165dc7daddb04b655704389b2d3ce0b71451c7a00290f3290f5510fa4b024e9e18c495c0d85ecb5e705173b84baa2536659fae52aee50"

RPROVIDES:${PN} += "libtss2-tcti-pcap.so.0 \
libtss2-tcti-pcap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0 \
libtss2-tctildr.so.0"

inherit rpm
