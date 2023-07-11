SUMMARY = "A Higher Level Interface to the Netlink Service"
DESCRIPTION = "libnetlink provides a higher-level interface to rtnetlink(7). \
New programs should use libmnl-devel instead."
LICENSE = "GPL-2.0-or-later"

PV = "6.3"

RPM_NAME = "libnetlink-devel-6.3-1.2.aarch64.rpm"
RPM_HASH = "a3eac800ebe2c0ff329ba12b4955dee0456d8cd80c99326ed72db3e9d9ba2fdc3f6004228832d1a7a8712552b559f6dff46a331003015cd09e966bd6a2d1e254"

RPROVIDES:${PN} += "libnetlink \
libnetlink-devel"

RDEPENDS:${PN} += ""

inherit rpm
