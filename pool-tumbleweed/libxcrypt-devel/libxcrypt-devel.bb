SUMMARY = "Development files for libxcrypt"
DESCRIPTION = "The libxcrypt-devel package contains libraries and header files for \
developing applications that use libxcrypt."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.4.36"

RPM_NAME = "libxcrypt-devel-4.4.36-1.1.aarch64.rpm"
RPM_HASH = "92a363b963857dd01c8e39c7a3ed4bc917dde0f045bd625adbbb2152ed736422dfd7be6c6ccdf0f35425c956083b4549ef725f8a1918a99079e85ee0b2a8dd12"

RPROVIDES:${PN} += "glibc-devel-/usr/lib64/libcrypt.so \
libxcrypt-devel \
pkgconfig-libcrypt \
pkgconfig-libxcrypt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypt1 \
pkgconfig"

inherit rpm
