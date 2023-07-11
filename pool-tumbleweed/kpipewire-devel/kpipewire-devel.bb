SUMMARY = "Development files for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides the development files needed to build applications \
which use KPipeWire."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "kpipewire-devel-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "74cbd2a0042e0b2774d323fdd59cae7f8fde6a6e3f4e3eab3e8db58b29d1d85f2d669fce8d610b62b5afb7e7dba721e678c9e28f94d6e871ff1f26a297faf5a9"

RPROVIDES:${PN} += "cmake-KPipeWire \
kpipewire-devel"

RDEPENDS:${PN} += "kpipewire-imports \
libKPipeWire5 \
libKPipeWireDmaBuf5 \
libKPipeWireRecord5 \
pkgconfig-libpipewire-0.3"

inherit rpm
