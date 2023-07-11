SUMMARY = "Object Exchange daemon for sharing content"
DESCRIPTION = "Object Exchange daemon for sharing content."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-obexd-5.66-1.8.aarch64.rpm"
RPM_HASH = "3bd72b86b004bb662da106db7aa0709db895ca57e12e8db02156b7b320d53140b710b8ff161bce1d6ee12e625eeaee167c06a0ccfe836d918829811c1616d563"

RPROVIDES:${PN} += "bluez-obexd"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libicalvcal.so.3"

inherit rpm
