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

RPM_NAME = "libserialport-devel-0.1.1-2.13.aarch64.rpm"
RPM_HASH = "11eca32a0de3d05b773424709fb8d94fdd4bf2a3d65e0d85592ae8dd86d5e0c703824d3aef14076673fd621bde14f7eff6925af64d424582fbf5a73acd4d00ee"

RPROVIDES:${PN} += "libserialport-devel \
pkgconfig-libserialport"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libserialport0"

inherit rpm
