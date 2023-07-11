SUMMARY = "Command-line frontend for the org.freedesktop.Flatpak service"
DESCRIPTION = "This package contains a number of command-line utilities for use inside \
Flatpak sandboxes. They work by talking to portals."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "flatpak-spawn-1.0.5-2.5.aarch64.rpm"
RPM_HASH = "06b912f78e75f4f645902364e8f9704d9c033a02269e61db081bfe8a8793f5305eac658a0daac24a0bdfd7b0cdb40ab0eb2cc9e3f95ab1d764f75adffcc9f2ba"

RPROVIDES:${PN} += "flatpak-spawn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
