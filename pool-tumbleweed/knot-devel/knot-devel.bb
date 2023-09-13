SUMMARY = "Development files for the knot libraries"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains headers for knot."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "knot-devel-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "81ff6eab641402a4a46f2e94a8ace8b838d35666358f26824062dba2c1288e371c9c447ee29afd251d6106341733a5d709380e6bab52739c40007ed116d01cc2"

RPROVIDES:${PN} += "knot-devel \
pkgconfig-knotd \
pkgconfig-libdnssec \
pkgconfig-libknot \
pkgconfig-libzscanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
knot \
libdnssec9 \
libknot14 \
libzscanner4 \
pkgconfig-gnutls"

inherit rpm
