SUMMARY = "Development files for phodav"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the files needed for developing software using phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "phodav-devel-3.0-1.4.aarch64.rpm"
RPM_HASH = "f1746e9b0d1511047a5622c7faa479ae8aa52dccbfffeba14ac9cabf27a13966d6b18b3e96c8d283554c8fde2c170d67b48b391d42a6210a4f473c820ffc0e12"

RPROVIDES:${PN} += "phodav-devel \
pkgconfig-libphodav-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libphodav-3-0-0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0"

inherit rpm
