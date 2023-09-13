SUMMARY = "Header files for multipath-tools C API"
DESCRIPTION = "This package provides development files and documentation for libdmmp."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.6+71+suse.f07325e"

RPM_NAME = "libdmmp-devel-0.9.6+71+suse.f07325e-1.1.aarch64.rpm"
RPM_HASH = "17ae5f148a9c9e6f5b0f19e229ec94bc1e915257232e9c64bcdd2fb8eb5fbe410a5c19b71cbf32963f90361ffc1e64cdcfd8a1b338b95ae0d652b300093b910a"

RPROVIDES:${PN} += "libdmmp-devel \
pkgconfig-libdmmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdmmp0-2-0"

inherit rpm
