SUMMARY = "XDP helper library"
DESCRIPTION = "The libxdp package contains the libxdp library for managing XDP programs, \
used by the xdp-tools package"
LICENSE = "GPL-2.0"

PV = "1.3.1"

RPM_NAME = "libxdp1-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "ea4f0ab5f13f42fb1f595ce514e6e458bdc3665e96f20ba4d94b53a2c111a90616323c6d6def858f542caaba8f48686d8646991d4cf07fbc3d6223f3343b7c1e"

RPROVIDES:${PN} += "libxdp.so.1 \
libxdp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kernel-devel \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6"

inherit rpm
