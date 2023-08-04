SUMMARY = "Development files for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides the development files needed to build applications \
which use KPipeWire."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "kpipewire-devel-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "00aa82cc369b556cbf19d1669a8f85ff4362c8bb461f57c4b56675c75859f3cbdd0c06a4499ec5becb163c04b265c5698a2a6459de0abc850d3bc2f8c17d5c8d"

RPROVIDES:${PN} += "cmake-KPipeWire \
kpipewire-devel"

RDEPENDS:${PN} += "kpipewire-imports \
libKPipeWire5 \
libKPipeWireDmaBuf5 \
libKPipeWireRecord5 \
pkgconfig-epoxy \
pkgconfig-libpipewire-0.3"

inherit rpm
