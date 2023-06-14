SUMMARY = "Handles OS-specific details when using serial ports"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libserialport is a minimal, cross-platform shared library written in C \
that is intended to take care of the OS-specific details when writing \
software that uses serial ports."
LICENSE = "LGPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libserialport-devel-0.1.1-2.12.aarch64.rpm"
RPM_HASH = "4c5e53cd8d95782deca816a8aac2dbdd100b5e935eb1034a64f9f307c9858cce4bba02808ad8a8c65cd60a12ddad4d395a877fafb0590b7f7df57939905c3085"

RPROVIDES:${PN} += "libserialport-devel \
pkgconfig-libserialport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserialport0"

inherit rpm
