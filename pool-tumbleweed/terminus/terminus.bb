SUMMARY = "An X terminal written in Vala"
DESCRIPTION = "A terminal with the capabilities of Guake and Terminator."
LICENSE = "GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "terminus-2.3.1-1.2.aarch64.rpm"
RPM_HASH = "01e0feb664a588a637550ffa452d44eddda2010e773591adb11e0bda33f6e3c49a158f8b7ca7d6f8e49711818c459845045355ebeacec05543dad25202223c52"

RPROVIDES:${PN} += "config-terminus \
terminus"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm
