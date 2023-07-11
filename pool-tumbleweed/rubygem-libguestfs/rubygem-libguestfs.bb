SUMMARY = "Ruby bindings for libguestfs"
DESCRIPTION = "ruby-libguestfs contains Ruby bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "rubygem-libguestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "50ae2d8cc54192b459744b19a7f5c95937cafd032efc43b7e02addc78ff4147f198ce3e10bac27a1f0381c1de3a378097127b19d90c7a311d14df97a7665f0e2"

RPROVIDES:${PN} += "rubygem-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby"

inherit rpm
