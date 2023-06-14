SUMMARY = "HTTP web service mocking library"
DESCRIPTION = "uhttpmock is a project for mocking web service APIs which use HTTP or HTTPS. \
It provides a library, libuhttpmock, which implements recording and \
playback of HTTP request/response traces."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "typelib-1_0-Uhm-1_0-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "4d2b985217c2894e3b5d2489b54e607af3f55f3ca52d21f269cea74b09b04895f9889b1b4f757454f01226684d96596c30605adfa25b943a97a3c7b3c13823e7"

RPROVIDES:${PN} += "typelib-1-0-Uhm-1-0 \
typelib-Uhm"

RDEPENDS:${PN} += "libuhttpmock-1.0.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
