SUMMARY = "Ruby bindings for libguestfs"
DESCRIPTION = "ruby-libguestfs contains Ruby bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "rubygem-libguestfs-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "2eee5052c12c60d0973ac59301443db6f90df9ae3691b0fce9c179d3eaf6b41f299ff36f1e4ec2a881eef1499c194caf9a71a9ee4e28638a031eb90ec62058cb"

RPROVIDES:${PN} += "rubygem-libguestfs \
rubygem-libguestfs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libguestfs \
libguestfs.so.0()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby"

inherit rpm
