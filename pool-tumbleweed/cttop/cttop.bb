SUMMARY = "top-like program showing Netfilter connection tracking entries"
DESCRIPTION = "cttop is a top-like program that shows netfilter connection tracking \
entries. entries can be sorted by various criteria and grouped, e.g. \
by source address."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.g26"

RPM_NAME = "cttop-0.3.g26-3.13.aarch64.rpm"
RPM_HASH = "8b3d51f17809157666bafcc37226528f5c00b87436c5387a134fee4e5e40766193ac87a1c935f1ac7f1d9e82aac31412bc9f088b5a6c6e1c126b64992f298de6"

RPROVIDES:${PN} += "cttop \
cttop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libncurses.so.6()(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnfnetlink.so.0()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
