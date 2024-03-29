SUMMARY = "Mobile Broadband Interface Model (MBIM) protocol"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.4"

RPM_NAME = "libmbim-1.28.4-1.1.aarch64.rpm"
RPM_HASH = "515992797fae1cb8cb9958b81fd3d7edb4d3cc9cbfe395ece42303fa257bb46044494a82af87aa06da2e9166d2469e547b0c1b49fa51452406e53f60ff1f0a46"

RPROVIDES:${PN} += "libmbim"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmbim-glib.so.4"

inherit rpm
