SUMMARY = "Development files for the baresip library"
DESCRIPTION = "The baresip-devel package includes header files and libraries necessary \
for developing programs which use the baresip C library."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-devel-2.10.0-1.8.aarch64.rpm"
RPM_HASH = "553ad6ff6f9b6598221d1a2394560fe8c55af410548774fe05fd4ba9e716d1cc7066b34a5b4cdba1e7312a212364fe90bcdeeb8656c1604bb82e501ee5e47a5e"

RPROVIDES:${PN} += "baresip-devel \
pkgconfig-libbaresip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaresip2 \
pkgconfig"

inherit rpm
