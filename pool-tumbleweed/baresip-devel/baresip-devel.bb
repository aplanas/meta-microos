SUMMARY = "Development files for the baresip library"
DESCRIPTION = "The baresip-devel package includes header files and libraries necessary \
for developing programs which use the baresip C library."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "baresip-devel-2.10.0-1.10.aarch64.rpm"
RPM_HASH = "ac8026fd35bb0170f7e8f54726a9bf1f0419c36dba83e5631f78d6373596171d4291e9a276fc137399a1f7f808440a6c91981615c32cf27449add10eb5eb0d6f"

RPROVIDES:${PN} += "baresip-devel \
pkgconfig-libbaresip"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbaresip2 \
pkgconfig"

inherit rpm
