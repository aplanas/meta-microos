SUMMARY = "Utilities for Configuring the Linux Ethernet Bridge"
DESCRIPTION = "This package contains utilities for configuring the Linux ethernet \
bridge. The Linux ethernet bridge can be used for connecting multiple \
ethernet devices together. The connection is fully transparent: hosts \
connected to one ethernet device see hosts connected to the other \
ethernet devices directly."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-1.7.1-1.9.aarch64.rpm"
RPM_HASH = "4d8e05ffa54f5835aebe1af7daff7da77c4b6f261d2a322ceba5a4a88fe9f18cc0c96364054a92e7d1b251ff5df5acb07cede6f61d33ae6b332c678d946075ff"

RPROVIDES:${PN} += "bridge-utils \
bridge-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
