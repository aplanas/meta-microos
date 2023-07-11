SUMMARY = "Library to support Unicode and ASCII (byte string) conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions."
LICENSE = "LGPL-3.0-or-later"

PV = "20230702"

RPM_NAME = "libuna1-mini-20230702-1.1.aarch64.rpm"
RPM_HASH = "fb3957b8e77153de15212aca28ee0a7eb40be8832eda1ccd53dccabdd0a9235abe394f368386b39e7c09a8a87d52189c10c8a64873aa090e2bcde85707533246"

RPROVIDES:${PN} += "libuna.so.1 \
libuna1-mini"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
