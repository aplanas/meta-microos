SUMMARY = "A lightweight radio player"
DESCRIPTION = "A lightweight radio player written in C and GTK+. It offers a simple way \
to have your favorite radio stations at easy reach."
LICENSE = "GPL-3.0-only"

PV = "0.7.6"

RPM_NAME = "goodvibes-0.7.6-1.4.aarch64.rpm"
RPM_HASH = "0baa88f455b39c69c4df1f8305f4b4a6a8933fa91edd138b3004eaa2544d0de0c0287fad10d39ee13687be00ea43949e135c51f8f840f8ba9310a33b480e9e15"

RPROVIDES:${PN} += "goodvibes"

RDEPENDS:${PN} += "libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
