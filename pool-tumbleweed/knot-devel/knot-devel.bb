SUMMARY = "Development files for the knot libraries"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains headers for knot."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.9"

RPM_NAME = "knot-devel-3.2.9-1.1.aarch64.rpm"
RPM_HASH = "96d2b69e1bfb832a28bf6092f65d6579b4841962dac8f81769164850c3935e5dac22ad8166c26a795a4399caab79c35ef2963b9caeb7c7eab38fffadebc149ad"

RPROVIDES:${PN} += "knot-devel \
pkgconfig-knotd \
pkgconfig-libdnssec \
pkgconfig-libknot \
pkgconfig-libzscanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
knot \
libdnssec9 \
libknot13 \
libzscanner4 \
pkgconfig-gnutls"

inherit rpm
