SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libosmcomp5-3.3.24-3.8.aarch64.rpm"
RPM_HASH = "95b4d2cfd74c8bb58a4b525c8293013287feeef60e0b5a2e576a9a4a6e901dcd174cf1f78b1537a1339457ea6fe4823f39fd075dd3f342f5a16890de69af2099"

RPROVIDES:${PN} += "libosmcomp.so.5 \
libosmcomp5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
