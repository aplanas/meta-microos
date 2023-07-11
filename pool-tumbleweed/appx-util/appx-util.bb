SUMMARY = "Utility to create Microsoft .appx packages"
DESCRIPTION = "appx is a tool which creates and optionally signs \
Microsoft Windows APPX packages."
LICENSE = "BSD-3-Clause & MPL-2.0"

PV = "0.4"

RPM_NAME = "appx-util-0.4-2.5.aarch64.rpm"
RPM_HASH = "86e17cbab033f24a379a171848e3caca3ddb932c90b0f783128a62bb5594f9ef21ca955fe6e942005b07afaf3d8d22aa048495439fd80325b1e74bf962c82f02"

RPROVIDES:${PN} += "appx-util \
fb-util-for-appx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
