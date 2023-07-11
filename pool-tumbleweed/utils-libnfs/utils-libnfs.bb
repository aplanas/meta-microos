SUMMARY = "Utilities for accessing NFS servers"
DESCRIPTION = "The utils-libnfs package contains simple client programs for \
accessing NFS servers using libnfs."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "utils-libnfs-5.0.2-1.5.aarch64.rpm"
RPM_HASH = "9fa01100477d8b638c2b10c8e1970fa8d39d9ff48b1f340d3b007cb357a6d18d1b37cd7f998877b0dfbc50d14511c796b9cffffa1f0708c7769840d97e94cd89"

RPROVIDES:${PN} += "libnfs \
utils-libnfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.14"

inherit rpm
