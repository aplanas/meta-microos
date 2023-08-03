SUMMARY = "Static library for -static linking with libxcrypt"
DESCRIPTION = "This package contains the libxcrypt static libraries for -static \
linking.  You don't need this, unless you link statically, which \
is highly discouraged."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.36"

RPM_NAME = "libxcrypt-devel-static-4.4.36-1.1.aarch64.rpm"
RPM_HASH = "9502274178100775a96080ab301fda27a8df614893d99c77733ca436b49b9f9678463e5bd2ad05b4d3d379f62d5d0f9f299ad51c597cff88e8fd45ae3a715186"

RPROVIDES:${PN} += "glibc-devel-static-/usr/lib64/libcrypt.a \
libxcrypt-devel-static"

RDEPENDS:${PN} += "glibc-devel-static \
libxcrypt-devel"

inherit rpm
