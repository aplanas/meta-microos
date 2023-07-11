SUMMARY = "Thunderbolt 3 device manager"
DESCRIPTION = "Userspace system daemon to enable security levels for Thunderbolt 3 \
on GNU/Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.5"

RPM_NAME = "bolt-0.9.5-1.4.aarch64.rpm"
RPM_HASH = "ee49571e783982aaa308953874e9955d15f1a50bf02aabb490097957e074fb15c015b470ca9216e77c82d1c27729f07bf2c90031d4ede286a0e55f092f33c80f"

RPROVIDES:${PN} += "bolt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpolkit-gobject-1.so.0 \
libudev.so.1"

inherit rpm
