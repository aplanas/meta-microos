SUMMARY = "Development files for the knot libraries"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains headers for knot."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.8"

RPM_NAME = "knot-devel-3.2.8-1.1.aarch64.rpm"
RPM_HASH = "5f64809d43a41523d24516ea6219298c1bbaad0069e43ba81254b647aeb1ccfe063d826fe73d06580251715c11c6e65f0f29d36238a5906e11a49ad59e9ee0fb"

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
