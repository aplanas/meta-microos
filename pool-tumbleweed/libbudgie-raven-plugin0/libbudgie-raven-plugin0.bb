SUMMARY = "Shared library for Budgie raven plugins"
DESCRIPTION = "Shared library for budgie raven plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libbudgie-raven-plugin0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "7c5c8f7b22355a94e0d623239024d7b22265f12815bfbe794e4c932c1fc361b630c7e20cb4b52d8deb7bc83e722a3800f246b47df7bb1500896c4bb05a590381"

RPROVIDES:${PN} += "libbudgie-raven-plugin.so.0 \
libbudgie-raven-plugin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
