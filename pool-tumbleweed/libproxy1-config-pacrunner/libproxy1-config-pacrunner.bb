SUMMARY = "Libproxy module for PacRunner configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query PacRunner about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-pacrunner-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "b9346a9e3998883ac853ffee4663ecd98d20cad0d8368b443ae8222a5059e3c3c75e32c4d33fda48f6341d7718eae6c633c2ee6990e03319b5327d8864a27638"

RPROVIDES:${PN} += "libproxy1-config-pacrunner"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libproxy.so.1 \
libproxy1 \
libstdc++.so.6"

inherit rpm
