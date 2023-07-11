SUMMARY = "Adapter for remmina Python plugins"
DESCRIPTION = "This package provides an adapter used by remmina Python plugins"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-python-wrapper-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "eb23e724e33deed8324204a01669e7367e05554c7a5e73eb7cf503a26ee2fb0d022d75971005d6ae2a325e2078e029f610b2002086de15cf12b964d61f92bf76"

RPROVIDES:${PN} += "remmina-plugin-python-wrapper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgtk-3.so.0 \
libpython3.11.so.1.0 \
remmina"

inherit rpm
