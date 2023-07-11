SUMMARY = "Free kWnn Korean Input System"
DESCRIPTION = "Free kWnn Korean input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fkwnn-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "9e1e01e298da514d3397c5b829fb977c1c1c3ae5e24914be20c017e0d6858fa457ccf0de293904b0b0efb0157bcbd4068133f6c395dabd22a34b25f8d51a5b36"

RPROVIDES:${PN} += "config-fkwnn \
fkwnn"

RDEPENDS:${PN} += "/usr/bin/sh \
fwnncom \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libkwnn.so.0 \
libtinfo.so.6 \
libwrap.so.0 \
shadow"

inherit rpm
