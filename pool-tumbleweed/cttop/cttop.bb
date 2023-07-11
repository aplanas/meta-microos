SUMMARY = "top-like program showing Netfilter connection tracking entries"
DESCRIPTION = "cttop is a top-like program that shows netfilter connection tracking \
entries. entries can be sorted by various criteria and grouped, e.g. \
by source address."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.g26"

RPM_NAME = "cttop-0.3.g26-3.14.aarch64.rpm"
RPM_HASH = "f54defcd2c2dfe1acae94dbe8b7f3e305bddc229fb5987c25e895b9c961280b93f9e128d175eaf1fefe67435a01e700d49b29ef9afaf889c393ac1e3abf152fa"

RPROVIDES:${PN} += "cttop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libncurses.so.6 \
libnetfilter-conntrack.so.3 \
libnfnetlink.so.0 \
libtinfo.so.6"

inherit rpm
