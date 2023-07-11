SUMMARY = "Server library for twin"
DESCRIPTION = "Server library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtstl1-0.9.0+17-3.6.aarch64.rpm"
RPM_HASH = "ccee9f5dcf2f20e4a63d9c6f81c42f277e814d7a2eada5802bb5872de0a48d2048752103056c24b7088e81ada423fecc8922ca416c89e7f8834631aba262fae5"

RPROVIDES:${PN} += "libtstl.so.1 \
libtstl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
