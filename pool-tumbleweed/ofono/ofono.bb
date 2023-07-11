SUMMARY = "Mobile telephony application development framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API for integration with other \
stacks, cellular modems, and storage back ends. The plug-in API \
functionality is modeled on public standards, in particular 3GPP TS \
27.007 'AT command set for User Equipment (UE)'."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-1.34-1.8.aarch64.rpm"
RPM_HASH = "ac947f5c2f22b396b5019f7f640e824dadcf087e58199f71a22bd163c6a21ccd74934ce40e86d8de049cfacd31159de73bb27b4d50a8cfb5053443b302270703"

RPROVIDES:${PN} += "config-ofono \
ofono"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libudev.so.1 \
systemd"

inherit rpm
