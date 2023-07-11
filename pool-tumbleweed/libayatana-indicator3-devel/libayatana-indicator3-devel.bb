SUMMARY = "Development files for the Ayatana panel indicator applet library"
DESCRIPTION = "This package provides the development files required to build \
indicators and to go into the indicator applet."
LICENSE = "GPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "libayatana-indicator3-devel-0.9.0-1.12.aarch64.rpm"
RPM_HASH = "3cfdc17667be2100f96ea727126c70231e6819cd4d054bb7d115efa16bd4fe17f5b81f262a06602b20599920cfae9485392371364d03ba7c2cdb3777256064e9"

RPROVIDES:${PN} += "libayatana-indicator3-devel \
pkgconfig-ayatana-indicator3-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-indicator3-7 \
pkgconfig-gtk+-3.0 \
pkgconfig-libayatana-ido3-0.4"

inherit rpm
