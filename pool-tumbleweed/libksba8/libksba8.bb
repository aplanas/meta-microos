SUMMARY = "A X.509 Library"
DESCRIPTION = "KSBA is a library to simplify the task of working with X.509 \
certificates, CMS data, and related data."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later & MIT"

PV = "1.6.4"

RPM_NAME = "libksba8-1.6.4-1.1.aarch64.rpm"
RPM_HASH = "145e4f278e2d5fc8c35ead80a582497b66bc43cf7f58fbb52111dccbf2b19b98caaf988e26aa07f2ca2d37167c3b7c22cdec451804b9e845b52f45ea1e188af7"

RPROVIDES:${PN} += "libksba \
libksba.so.8 \
libksba8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpg-error.so.0"

inherit rpm
