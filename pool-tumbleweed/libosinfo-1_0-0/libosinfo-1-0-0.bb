SUMMARY = "Operating system and hypervisor information management library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-1_0-0-1.10.0-3.4.aarch64.rpm"
RPM_HASH = "72b8c7bdf14e37f905374e9166325b089d3ebb3e80fb25732a3675e40aa02c304db39a56977e8938b05a5f41c2ea21e188d2f7fa9f32522421e7c6197332827d"

RPROVIDES:${PN} += "libosinfo-1-0-0 \
libosinfo-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libosinfo \
libsoup-3.0.so.0 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
