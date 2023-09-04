SUMMARY = "DAV protocol implementation"
DESCRIPTION = "kdav is a library providing a KJob-based implementation of DAV protocols such as \
CardDAV, WebDAV, and CalDAV."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kdav-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2fea32eafc5188827ad28fb17a4756f049e70f60ef6a52138e4a0a79d63bef9f275513a63856c5bc2b634510516a4111e5204a1985d28a7318fec9cc8a0a98a6"

RPROVIDES:${PN} += "kdav"

RDEPENDS:${PN} += ""

inherit rpm
