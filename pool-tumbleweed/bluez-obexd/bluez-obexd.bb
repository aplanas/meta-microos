SUMMARY = "Object Exchange daemon for sharing content"
DESCRIPTION = "Object Exchange daemon for sharing content."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-obexd-5.68-4.1.aarch64.rpm"
RPM_HASH = "893cdf2c53b7f5de9db6c53149e113de4c0f0c935b352cc468fc06786576b8e2a7831a256a30370a4f4bb21edf864dde4ecbcf46c9e928ec8fe7dbd3ed1a912e"

RPROVIDES:${PN} += "bluez-obexd"

RDEPENDS:${PN} += "/usr/bin/sh \
bluez \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libicalvcal.so.3"

inherit rpm
