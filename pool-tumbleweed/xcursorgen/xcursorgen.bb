SUMMARY = "Utility to create an X cursor file from a collection of PNG images"
DESCRIPTION = "xcursorgen prepares X11 cursor sets for use with libXcursor."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "xcursorgen-1.0.8-1.2.aarch64.rpm"
RPM_HASH = "f04b8bf9a5afb5901f20a77812334a77e4456abe9d607fbb64852c74c2dad8a696294312c9143bd849b3572a242652ba043c542f8c2082bc16b1a75c09ed85c2"

RPROVIDES:${PN} += "xcursorgen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libc.so.6 \
libpng16.so.16"

inherit rpm
