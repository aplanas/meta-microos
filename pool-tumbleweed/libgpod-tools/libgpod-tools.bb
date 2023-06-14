SUMMARY = "Tools for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package includes support tools for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-tools-0.8.3-12.5.aarch64.rpm"
RPM_HASH = "fd6a2b199b1b290e266fd8bba17c75a2825fc56267e4b93fc532a00c4b07dab2c92de450a841b5ae43f37c30d5b28fa60f928a4662a2e677e8e94bd668741a4c"

RPROVIDES:${PN} += "libgpod-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.3 \
libsgutils2-1.48.so.2 \
libusb-1.0.so.0 \
libxml2.so.2"

inherit rpm
