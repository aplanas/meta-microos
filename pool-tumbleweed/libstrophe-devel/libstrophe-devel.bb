SUMMARY = "Development files for libstrophe"
DESCRIPTION = "Development files and headers for libstrophe"
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.2"

RPM_NAME = "libstrophe-devel-0.12.2-1.5.aarch64.rpm"
RPM_HASH = "ca8dd08dc7d8b7915248480fbc96ca749aea1f8471a626b0e805bd3ade0255f606fe9eff3163e0202285a79bf9f064e261c7517f8b4425a53b342a0227912668"

RPROVIDES:${PN} += "libstrophe-devel \
pkgconfig-libstrophe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstrophe0 \
pkgconfig-libxml-2.0 \
pkgconfig-openssl"

inherit rpm
