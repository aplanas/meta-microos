SUMMARY = "Ruby bindings for libguestfs"
DESCRIPTION = "ruby-libguestfs contains Ruby bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "rubygem-libguestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "3c11a3588e9c2765de12e74ea9a9e2eab1fccc3dfe60d04260998bfacc630bda80b06cd87e26124068374427bb0fb3c609ca1c4d9f17bcc71c300c2b0e04f84f"

RPROVIDES:${PN} += "rubygem-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby"

inherit rpm
