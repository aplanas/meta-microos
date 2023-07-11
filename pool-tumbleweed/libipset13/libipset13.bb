SUMMARY = "Userspace library for the in-kernel Netfilter ipset interface"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set."
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "libipset13-7.17-1.3.aarch64.rpm"
RPM_HASH = "c5705f39ba95910b9c1682cd4fd7e81fdd4138b8c63b03ac38d5b98cd845b9f7b8cf39ffe465bb4a49415d45b19d94d9789f16e79cfad4233f8c874bc46ecb1a"

RPROVIDES:${PN} += "libipset.so.13 \
libipset13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
