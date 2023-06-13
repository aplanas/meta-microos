SUMMARY = "TCTI pcap interface library"
DESCRIPTION = "A TCTI which prints TPM commands and responses to a file in pcap-ng format. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-pcap0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "b54273b7a5008c8a453f9e185592c109cedb1e16496d41e5b49981cd114e8270cebf614dc3f93daf95ef9e11aa870be6ae9d7f702b6b5e2df134fe32b21fc86e"

RPROVIDES:${PN} += "libtss2-tcti-pcap.so.0()(64bit) \
libtss2-tcti-pcap0 \
libtss2-tcti-pcap0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtss2-mu.so.0()(64bit) \
libtss2-tctildr.so.0()(64bit)"

inherit rpm
