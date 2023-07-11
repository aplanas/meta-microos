SUMMARY = "Eog fit to width plugin"
DESCRIPTION = "The Eye of Gnome fit to width plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.0"

RPM_NAME = "eog-plugin-fit-to-width-44.0-1.2.aarch64.rpm"
RPM_HASH = "d09d3fb3782ac1a852e934077a3af71dbeb3a7b7f8b8ec4ebfb0ce7edc2b31be578abd4965c4cb5d1d7e76abfe4b48e3980cf97a80bbf16a5e7294feda4fc08a"

RPROVIDES:${PN} += "eog-plugin-fit-to-width \
eog-plugins-/usr/lib64/eog/plugins/fit-to-width.plugin \
libfit-to-width.so"

RDEPENDS:${PN} += "eog-plugins-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeog.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpeas-1.0.so.0"

inherit rpm
