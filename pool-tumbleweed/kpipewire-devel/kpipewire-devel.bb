SUMMARY = "Development files for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides the development files needed to build applications \
which use KPipeWire."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "kpipewire-devel-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "602fbfd137b4c6478bdbe0c920c0adb6bb18a5c462f3064f8e86c88e119522adf96f892ecb86eb18880bbaab9aa69c497789c78fd4e480eb440b33cef87311c0"

RPROVIDES:${PN} += "cmake(KPipeWire) \
kpipewire-devel \
kpipewire-devel(aarch-64)"

RDEPENDS:${PN} += "kpipewire-imports \
libKPipeWire5 \
libKPipeWireDmaBuf5 \
libKPipeWireRecord5 \
pkgconfig(libpipewire-0.3)"

inherit rpm
