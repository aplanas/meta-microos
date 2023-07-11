SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap-devel-1.10.4-1.2.aarch64.rpm"
RPM_HASH = "fd4350ccb0657ae591dbf536592bd0a6078b9de27f5aca154ed1fddeacf3435ef1ccac6e9fa63c4357f05baf8d67fe4888178f5cb2cc838f8bd22f6d790801dc"

RPROVIDES:${PN} += "libpcap-devel \
pkgconfig-libpcap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libpcap1 \
pkgconfig-dbus-1 \
pkgconfig-libnl-genl-3.0"

inherit rpm
