SUMMARY = "Object Exchange daemon for sharing content"
DESCRIPTION = "Object Exchange daemon for sharing content."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-obexd-5.69-1.1.aarch64.rpm"
RPM_HASH = "f348c3af6392746c995b5e493c26e8658647c188d5646160d16328297e1438412dee82c2ef63922258e1fc0fd895975759dcca55887759fd3ab52b486232afb5"

RPROVIDES:${PN} += "bluez-obexd"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libicalvcal.so.3"

inherit rpm
