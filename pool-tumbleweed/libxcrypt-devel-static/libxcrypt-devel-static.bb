SUMMARY = "Static library for -static linking with libxcrypt"
DESCRIPTION = "This package contains the libxcrypt static libraries for -static \
linking.  You don't need this, unless you link statically, which \
is highly discouraged."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.35"

RPM_NAME = "libxcrypt-devel-static-4.4.35-1.1.aarch64.rpm"
RPM_HASH = "345c6a743a527ad35e67361529335c7efb59d6098d4f3962c98622f56b3cdd8e12270bf85addd39e74f93184c5de8ba5d5fd3149d03e25cef6a3f90d831c0c13"

RPROVIDES:${PN} += "glibc-devel-static-/usr/lib64/libcrypt.a \
libxcrypt-devel-static"

RDEPENDS:${PN} += "glibc-devel-static \
libxcrypt-devel"

inherit rpm
