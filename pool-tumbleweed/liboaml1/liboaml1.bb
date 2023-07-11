SUMMARY = "Open Adaptive Music library"
DESCRIPTION = "OAML is a library for implementing adaptive music in games. \
This package contains the shared library."
LICENSE = "Apache-2.0"

PV = "1.3.4"

RPM_NAME = "liboaml1-1.3.4-1.15.aarch64.rpm"
RPM_HASH = "568d35d88f028c08a6b81c9ddb9b22dc6b7e4766a78760a229f53e1f219135956dcd9fbb07682336bf0bdb529f3416af77bc7f0eef0b5a8a41f40598e5447558"

RPROVIDES:${PN} += "liboaml.so.1 \
liboaml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsoxr.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
