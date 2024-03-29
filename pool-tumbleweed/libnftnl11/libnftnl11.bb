SUMMARY = "Userspace library to access the nftables Netlink interface"
DESCRIPTION = "libnftnl is a userspace library providing a low-level netlink \
programming interface (API) to the in-kernel nf_tables subsystem."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libnftnl11-1.2.6-1.1.aarch64.rpm"
RPM_HASH = "f10930f574bc0a392d85888b81840cdd60e8c39f24c17e50b8eea71b86662803723bfca0dd3463cd4f905aa80b499b60d869eb15753d0bdb8985209ed1a404dd"

RPROVIDES:${PN} += "libnftnl.so.11 \
libnftnl11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
