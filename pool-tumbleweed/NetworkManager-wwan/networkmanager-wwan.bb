SUMMARY = "Mobile broadband device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for mobile broadband (WWAN) \
devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "NetworkManager-wwan-1.42.6-2.1.aarch64.rpm"
RPM_HASH = "78481248a711017ba2ec3441d762aa6eaa4b9076a21cab7c9209171e186951a62196baae3ad6b7a12e2f39c4c270baf3baa47ef12c742de44aa576236c496887"

RPROVIDES:${PN} += "NetworkManager-wwan \
libnm-device-plugin-wwan.so \
libnm-wwan.so"

RDEPENDS:${PN} += "ModemManager \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmm-glib.so.0 \
libsystemd.so.0"

inherit rpm
