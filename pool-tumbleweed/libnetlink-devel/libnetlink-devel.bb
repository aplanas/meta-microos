SUMMARY = "A Higher Level Interface to the Netlink Service"
DESCRIPTION = "libnetlink provides a higher-level interface to rtnetlink(7). \
New programs should use libmnl-devel instead."
LICENSE = "GPL-2.0-or-later"

PV = "6.3"

RPM_NAME = "libnetlink-devel-6.3-1.1.aarch64.rpm"
RPM_HASH = "c13c7cd8b710cc0a669369ffba711360070ffe8dac91d3bb08de8c22518b1b43e1dd42ea3cdbbb0bf7c0e5df61922f034bf53b820455c289728082a14ea6b25b"

RPROVIDES:${PN} += "libnetlink \
libnetlink-devel \
libnetlink-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
