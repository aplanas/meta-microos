SUMMARY = "Tool for kernel configurations comparison"
DESCRIPTION = "kccmp is a simple tool for comparing two linux kernel '.config' files."
LICENSE = "GPL-2.0-only"

PV = "1.0.0"

RPM_NAME = "kccmp-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "1dd11418c2608de42dc435dce4be6cfc8532ce4e2aa334d967d00b088259cd7e2248c86fe36cfe02946bdf8848aacbdd92ea5093b6ee9dceb052195ce974e48c"

RPROVIDES:${PN} += "kccmp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
