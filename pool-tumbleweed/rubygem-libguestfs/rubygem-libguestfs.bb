SUMMARY = "Ruby bindings for libguestfs"
DESCRIPTION = "ruby-libguestfs contains Ruby bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "rubygem-libguestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "2fc45ffd2f5d4ec4f3b656fb708d6e7f7364e1eb7d0c30ba065bef918b6faf634e16894ecc7b31e3743ac09d0a40035f2fbeb5d6dd1015bdafba72a31241b827"

RPROVIDES:${PN} += "rubygem-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0 \
libm.so.6 \
libruby3.2.so.3.2 \
ruby"

inherit rpm
