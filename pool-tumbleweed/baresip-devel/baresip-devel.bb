SUMMARY = "Development files for the baresip library"
DESCRIPTION = "The baresip-devel package includes header files and libraries necessary \
for developing programs which use the baresip C library."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-devel-2.10.0-1.9.aarch64.rpm"
RPM_HASH = "078a586567ad88b96022390cf27b6f15f71aa3b755c3a6690a3d75b702c678ee524102e1994a27187b177a4fc0df09e929768bba1ef78d703afecd111793aa31"

RPROVIDES:${PN} += "baresip-devel \
pkgconfig-libbaresip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaresip2 \
pkgconfig"

inherit rpm
