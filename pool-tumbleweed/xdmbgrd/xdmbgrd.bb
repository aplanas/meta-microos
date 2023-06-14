SUMMARY = "SUSE Linux background"
DESCRIPTION = "The SUSE Linux background for your XDM workstation."
LICENSE = "GPL-2.0-or-later"

PV = "0.8"

RPM_NAME = "xdmbgrd-0.8-1.5.aarch64.rpm"
RPM_HASH = "27cbce85f19acecd1fb2fde4e9400c6a9d0173fe11926d5be26439ba9830d5fdc2526f25fa1b6995c296e3290d3b8c1d191a4b5c51ae785f716e909c0ca35431"

RPROVIDES:${PN} += "xdmbgrd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXpm.so.4 \
libc.so.6 \
libz.so.1"

inherit rpm
