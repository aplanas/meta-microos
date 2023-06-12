SUMMARY = "A Library for Network Sniffers"
DESCRIPTION = "libpcap is a library used by packet sniffer programs. It provides an \
interface for them to capture and analyze packets from network devices. \
This package is only needed if you plan to compile or write such a \
program yourself."
LICENSE = "BSD-3-Clause"

PV = "1.10.4"

RPM_NAME = "libpcap-devel-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "79a799b6fc1014402f35c26702ef2f323e86bd55b7bc319434dca00a7cd6ebd2f3b5276486427f40eb837677ab80ed97113220d32ba740b7b91a6c0150c3be98"

RPROVIDES:${PN} += "libpcap-devel \
libpcap-devel(aarch-64) \
pkgconfig(libpcap)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
glibc-devel \
libpcap1 \
pkgconfig(dbus-1) \
pkgconfig(libnl-genl-3.0)"

inherit rpm
