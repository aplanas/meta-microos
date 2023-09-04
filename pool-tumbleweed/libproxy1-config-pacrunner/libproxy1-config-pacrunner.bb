SUMMARY = "Libproxy module for PacRunner configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query PacRunner about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-pacrunner-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "9b7f6020781c41b3298d674b815e516a197035af0488f297644f14e136852ddc97edb2b9a58714e657bb6739e9595d69ee3d39d94d6c439299d0f91dba63b825"

RPROVIDES:${PN} += "libproxy1-config-pacrunner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libproxy.so.1 \
libproxy1 \
libstdc++.so.6"

inherit rpm
