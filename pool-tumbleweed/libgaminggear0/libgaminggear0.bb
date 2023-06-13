SUMMARY = "Gaming input devices library - libgaminggear"
DESCRIPTION = "A shared library initiated by the Roccat Linux driver project. \
 \
This package holds libgaminggear."
LICENSE = "GPL-2.0-only & CC-BY-3.0"

PV = "0.15.1"

RPM_NAME = "libgaminggear0-0.15.1-3.15.aarch64.rpm"
RPM_HASH = "b4c1e8929ab2efa3cd5b7cc0f8b58fbe0250a2fc6c94b4d385c8078896ac265f73f4cc342e84a7049f9ed5007f55f0864af093fc928944948ae5f6b5abe1beb1"

RPROVIDES:${PN} += "libgaminggear.so.0()(64bit) \
libgaminggear0 \
libgaminggear0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcanberra.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnotify.so.4()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
