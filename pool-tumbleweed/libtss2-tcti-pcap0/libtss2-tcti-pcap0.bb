SUMMARY = "TCTI pcap interface library"
DESCRIPTION = "A TCTI which prints TPM commands and responses to a file in pcap-ng format. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-pcap0-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "3bc96a585f3940724870eb59d6a862e986396588976fc50dc842584e3462200bed0e4a7849dd34fc68996acc2b1bb185b665c49098c7812abbda502d2fb1a990"

RPROVIDES:${PN} += "libtss2-tcti-pcap.so.0 \
libtss2-tcti-pcap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtss2-mu.so.0 \
libtss2-tctildr.so.0"

inherit rpm
