SUMMARY = "Tools and libraries to work with AppStream metadata"
DESCRIPTION = "AppStream-Core makes it easy to access application information from the \
AppStream database over a nice GObject-based interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "f04dbc32c7cd485b278c8b310e7ceea8a0ce25b94b0bcf541c02d8bda36afec85e6b6b3fd55425488294879dfd788840225e68705c5759506ffc13063fe917f8"

RPROVIDES:${PN} += "AppStream \
config-AppStream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
