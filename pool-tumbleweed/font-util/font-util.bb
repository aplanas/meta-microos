SUMMARY = "X.Org font package creation/installation utilities"
DESCRIPTION = "This package provides utilities for X.Org font package \
creation/installation."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "font-util-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "d1d9d5b9f8ddee5796417c91d084f94209c47bba5b6b6a25f5fdc88f34bcd846b9d14e992fb97a8b0cd593c2a396bbc10202f80416aa306257bb9ae49483ccd8"

RPROVIDES:${PN} += "font-util \
pkgconfig-fontutil \
xorg-x11-fonts-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
