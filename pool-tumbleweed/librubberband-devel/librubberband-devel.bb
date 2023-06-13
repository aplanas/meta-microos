SUMMARY = "Development files for librubberband"
DESCRIPTION = "The librubberband-devel package contains libraries and header files for \
developing applications that use librubberband."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "librubberband-devel-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "e5e8a8ae695cbdc00c9301e8cfba1296cbe0b6698165a36e2ed67fccd30410dd096eb1cca813370aa31eeb5e80b20946c3955e14cf8e6b47b42a580a45fda0e5"

RPROVIDES:${PN} += "librubberband-devel \
librubberband-devel(aarch-64) \
pkgconfig(rubberband)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librubberband2 \
pkgconfig \
pkgconfig(fftw3)"

inherit rpm
