SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "libuhttpmock-1_0-1-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "068d414f9a79e29aaf707b701edd3631ab589e48d21a7b977e4150247f71fff9fd39ee8b539078da3cd19d14641b4e793997ba74c02ff57371942ecc39e98b47"

RPROVIDES:${PN} += "libuhttpmock-1.0.so.1()(64bit) \
libuhttpmock-1_0-1 \
libuhttpmock-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
