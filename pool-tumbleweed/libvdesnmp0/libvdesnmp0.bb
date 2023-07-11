SUMMARY = "VDE snmp library"
DESCRIPTION = "This package contains VDE snmp library \
SNMP library for Virtual Distributed Ethernet"
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp0-2.3.2+svn587-3.24.aarch64.rpm"
RPM_HASH = "ab8bc938b4caf82f15955a735193580807bfd4cb1d873be5465983df8a34a5e7c264f1cc9a2a6e95afb70adcacd4f3ab52e160e972656ffa368d98edf7866815"

RPROVIDES:${PN} += "libvdesnmp.so.0 \
libvdesnmp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvdemgmt.so.0"

inherit rpm
