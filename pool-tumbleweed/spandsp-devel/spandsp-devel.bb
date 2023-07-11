SUMMARY = "Development files for the SpanDSP library"
DESCRIPTION = "This package contains files that are needed for developing or compiling \
software that uses the spandsp library."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+g21"

RPM_NAME = "spandsp-devel-3.0.0+g21-1.1.aarch64.rpm"
RPM_HASH = "54ba6d2d75f4093ead49867459988690b18abe181b51284e210fd332d285675b7adc710e67d1ee2a1c0c4b1af6cc265de60e1951d473bff6d5c8687fdd66757f"

RPROVIDES:${PN} += "pkgconfig-spandsp \
spandsp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjpeg-devel \
libspandsp3 \
libtiff-devel"

inherit rpm
