SUMMARY = "GTP tunnel configuration utilities"
DESCRIPTION = "Utilities to configure GTP tunnels."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "libgtpnl-tools-1.2.3-1.3.aarch64.rpm"
RPM_HASH = "a04ea42a076a11e2cc58a4034c9e327f7fa956980a66b3b2559bd17cf69d9c5053c80ede2e5bd6d897b8a69b7607071396b85e58109bea71dcf3acec80963869"

RPROVIDES:${PN} += "libgtpnl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgtpnl.so.0 \
libmnl.so.0"

inherit rpm
