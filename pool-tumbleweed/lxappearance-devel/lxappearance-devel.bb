SUMMARY = "Lxappearance development files"
DESCRIPTION = "Development files to build lxappearance plugins"
LICENSE = "GPL-2.0-only"

PV = "0.6.3"

RPM_NAME = "lxappearance-devel-0.6.3-1.14.aarch64.rpm"
RPM_HASH = "5e41a32e0ca7257f9895edf31a5a98f4b0623dda04a46800cab9f588c3eb83c221085de4b0186e0e267750aada0fcc59b19f667368dc2ee4ba8ee9631be3002b"

RPROVIDES:${PN} += "lxappearance-devel \
pkgconfig-lxappearance"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lxappearance \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
