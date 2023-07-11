SUMMARY = "Development files for librubberband"
DESCRIPTION = "The librubberband-devel package contains libraries and header files for \
developing applications that use librubberband."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "librubberband-devel-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "5ffa4e5c8dd9ee83c8ac29e3a7c58a0661518478d5cc619bffad5eef2caab231c381a44fa633f7ee79fbe9570b32ea9167af8259805bc2ed4e95e2ce1373c12b"

RPROVIDES:${PN} += "librubberband-devel \
pkgconfig-rubberband"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librubberband2 \
pkgconfig \
pkgconfig-fftw3"

inherit rpm
