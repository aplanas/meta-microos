SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "libuhttpmock-1_0-1-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "97f630edb614ff0784104d6c7111c1d4852ba73f168763601193bdb73e219248888103f99e2c23b007d94e6cbd28d2915599679fb75c219aca1d97db4e5e4424"

RPROVIDES:${PN} += "libuhttpmock-1-0-1 \
libuhttpmock-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
