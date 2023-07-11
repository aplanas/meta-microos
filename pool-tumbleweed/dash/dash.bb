SUMMARY = "POSIX-compliant Implementation of /bin/sh"
DESCRIPTION = "DASH is a POSIX-compliant implementation of /bin/sh that aims to be as small as \
possible without sacrificing speed where possible."
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "dash-0.5.12-2.3.aarch64.rpm"
RPM_HASH = "36ba52172b90b80b6c6f2fb469c060e0ebf7e22aad20fe14623e150846287557cdefbdc4d1e58c507924603688ad1b7f0f234597ea31d6397f7e17a8ae0f2d32"

RPROVIDES:${PN} += "dash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libedit.so.0"

inherit rpm
