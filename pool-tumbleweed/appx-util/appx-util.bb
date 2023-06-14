SUMMARY = "Utility to create Microsoft .appx packages"
DESCRIPTION = "appx is a tool which creates and optionally signs \
Microsoft Windows APPX packages."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "0.4"

RPM_NAME = "appx-util-0.4-2.4.aarch64.rpm"
RPM_HASH = "928ad3e20b72f939ad3fd45ed1262c19c9385d075be35d1463cb18c2fd1e012f66a5ff5e78cfc43c8509ca4f1e17a0061ccb8dcd01273220c70873f54558acab"

RPROVIDES:${PN} += "appx-util \
fb-util-for-appx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
