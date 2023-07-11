SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-1.14.aarch64.rpm"
RPM_HASH = "77dece20320fd28f56f27c5bb55ad887f9ced9336bae89ab2f5a30aa6267fb5b22b18409afc7ab1ed21be625fdc63bffef2bb3963ae88d44f465069e32b35ae9"

RPROVIDES:${PN} += "vido"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
youtube-dl"

inherit rpm
