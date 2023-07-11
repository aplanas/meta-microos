SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "typelib-1_0-Uhm-1_0-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "063b90f5d0139d90e0e56485884b7ed77d5b401bf9422cda5604c6719b7e90d2e295e46e7f3b46a556d954bfb9d90774929a46dd4fa229603a37756a18d4ffd6"

RPROVIDES:${PN} += "typelib-1-0-Uhm-1-0 \
typelib-Uhm"

RDEPENDS:${PN} += "libuhttpmock-1.0.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
