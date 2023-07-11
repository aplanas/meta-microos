SUMMARY = "Utilities for Configuring the Linux Ethernet Bridge"
DESCRIPTION = "This package contains utilities for configuring the Linux ethernet \
bridge. The Linux ethernet bridge can be used for connecting multiple \
ethernet devices together. The connection is fully transparent: hosts \
connected to one ethernet device see hosts connected to the other \
ethernet devices directly."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "bridge-utils-1.7.1-1.10.aarch64.rpm"
RPM_HASH = "59dd8c56b7efa77b4bac91949a30549b257d53ade452fef4eb39d104265c23c2bf75dbd6a328698c4127cb9a235a3eb099edfb25710557472c3326cf61433dbb"

RPROVIDES:${PN} += "bridge-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
